package com.example.employee.viewObserver

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.library.baseAdapters.BR
import com.example.employee.model.RepositoryDetailsResponse

class DetailsViewObserver : BaseObservable() {
    private  var mModel : RepositoryDetailsResponse? = null

    private var mIsProgressing: Boolean = false

    private var mIsError:Boolean =false;
    /**
     * Progress Visibility
     */
    @Bindable
    fun getProgressBarVisibility() =if  (mIsProgressing)View.VISIBLE else View.GONE


    /**
     * Error view Visibility
     */
    @Bindable
    fun getErrorViewVisibility() =if  (mIsError)View.VISIBLE else View.GONE


    /**
     * Common view Visibility
     */
    @Bindable
    fun getCommonViewVisibility() =if  (mIsError)View.GONE else View.VISIBLE


    fun setData(data :RepositoryDetailsResponse)
    {
        mModel =data;
        notifyChange()
    }


    fun setProgressVisibility(condition: Boolean) {
        mIsProgressing = condition
        Log.d("Log",condition.toString())
        notifyPropertyChanged(BR.progressBarVisibility)
    }

    fun setErrorVisibility(condition: Boolean) {
        mIsError = condition
        Log.d("Log",condition.toString())
        notifyPropertyChanged(BR.errorViewVisibility)
        notifyPropertyChanged(BR.commonViewVisibility)
    }
}