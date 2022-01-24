package com.example.employee.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
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

        loadSearchFunctionality()
        loadPullToRefreshFunctionality()
        loadRetryButton()
        fetchData("")

    }

    private fun loadData(query: String?) {
        mViewModel.setKeyword(query)
        mViewModel.filterData(query)?.observe(this, { data ->
            mAdapter.setData(data.toList())
            mAdapter.notifyDataSetChanged()
        })
    }


    private fun loadSearchFunctionality() {
        svSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                loadData(query)
                return true
            }
        })

    }

    private fun loadPullToRefreshFunctionality() =
        rlRefresh.setOnRefreshListener {
            loadData(mViewModel.getKeyword())
            rlRefresh.isRefreshing = false
        }

    private fun loadRetryButton() = btnRetry.setRxOnClickListener {
        fetchData("")
    }


    private fun setAdapter() {
        rvRepository.adapter = mAdapter
    }

    private fun fetchData(keyword: String) {
        mViewObserver.setErrorVisibility(false)
        mViewModel.getDetails(keyword).observe(this,  { response ->
            Log.d("log", response.body.toString())
            when (response.status) {
                NetworkStatus.SUCCESS -> {
                    mViewObserver.setProgressVisibility(false)
                    loadData("")

                }

                NetworkStatus.ERROR -> {
                    Log.d("Log", "Error")
                    mViewObserver.setProgressVisibility(false)
                    response.exception?.let { appException ->
                        if (appException.cause is UnknownHostException || appException.cause is SocketTimeoutException) {
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