package com.example.employee.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.employee.R
import com.example.employee.databinding.ActivityMainBinding
import com.example.employee.utils.NetworkStatus
import com.example.employee.utils.setRxOnClickListener
import com.example.employee.utils.simplePositiveDialogBox
import com.example.employee.view.adapter.RepositoryAdapter
import com.example.employee.viewObserver.DetailsViewObserver
import com.example.employee.viewmodel.RepositoryViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.net.SocketTimeoutException
import java.net.UnknownHostException

@SuppressLint("NotifyDataSetChanged")
class MainActivity : AppCompatActivity() {

    private val mViewModel: RepositoryViewModel by viewModel()
    private val mAdapter = RepositoryAdapter()
    private var mViewObserver = DetailsViewObserver()
    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        mViewBinding.data = mViewObserver
        setAdapter()
        loadApi("")
        loadSearchFunctionality()
        loadPullToRefreshFunctionality()
        loadRetryButton()
    }

    private fun loadApi(query: String?) {
        mViewModel.setKeyword(query)
        if (query.isNullOrEmpty()) {
            loadData("")
        } else {
//            val data = mViewModel.filterData(query)
//            data?.let {
//                mAdapter.setData(it.toList())
//                mAdapter.notifyDataSetChanged()
//            }


        }
    }


    private fun loadSearchFunctionality() {
        svSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                loadApi(query)
                return true
            }
        })

    }

    private fun loadPullToRefreshFunctionality() =
        rlRefresh.setOnRefreshListener {
            loadApi(mViewModel.getKeyword())
            rlRefresh.isRefreshing = false
        }

    private fun loadRetryButton()=btnRetry.setRxOnClickListener {
        loadApi("")
    }


    private fun setAdapter() {
        rvRepository.adapter = mAdapter
    }

    private fun loadData(keyword: String) {
        mViewObserver.setErrorVisibility(false)
        mViewModel.getDetails(keyword).observe(this, Observer { response ->
            Log.d("log", response.body.toString())
            when (response.status) {
                NetworkStatus.SUCCESS -> {
                    Log.d("Log", "Success")
                    mViewObserver.setErrorVisibility(false)
                    mViewObserver.setProgressVisibility(false)
                    response?.body?.let {
                        mAdapter.setData(it.toList())
                        mViewModel.setRepositoryData(it)
                        mAdapter.notifyDataSetChanged()
                    }

                }

                NetworkStatus.ERROR -> {
                    Log.d("Log", "Error")
                    mViewObserver.setProgressVisibility(false)
                    response.exception?.let { appException ->
                        if (appException.cause is UnknownHostException || appException.cause is SocketTimeoutException) {
                            Log.i("wwewe","entered")
                            mViewObserver.setErrorVisibility(true)
                        } else {
                            response.exception.getErrorReponse()?.message?.let {
                                if (it != "Not Found") {
                                    simplePositiveDialogBox(
                                        this, getString(R.string.info),
                                        it,
                                        getString(R.string.ok)
                                    )
                                }
                            }

                        }
                    }


                }
                NetworkStatus.LOADING -> {
                    Log.d("Log", "Loading")
                    mViewObserver.setProgressVisibility(true)


                }

            }
        })

    }
}