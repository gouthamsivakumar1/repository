package com.example.employee.viewObserver

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.library.baseAdapters.BR

class DetailsViewObserver : BaseObservable() {

    private var mIsProgressing: Boolean = false

    private var mIsError: Boolean = false;


    /**
     * Progress Visibility
     */
    @Bindable
    fun getProgressBarVisibility() = if (mIsProgressing) VISIBLE else GONE


    /**
     * Error view Visibility
     */
    @Bindable
    fun getErrorViewVisibility() = if (mIsError) VISIBLE else GONE


    /**
     * Common view Visibility
     */
    @Bindable
    fun getCommonViewVisibility() = if (mIsError) GONE else VISIBLE


    /**
     * setter for progress bar
     */
    fun setProgressVisibility(condition: Boolean) {
        mIsProgressing = condition
        notifyPropertyChanged(BR.progressBarVisibility)
    }

    /**
     *  setter for error view
     */
    fun setErrorVisibility(condition: Boolean) {
        mIsError = condition
        notifyPropertyChanged(BR.errorViewVisibility)
        notifyPropertyChanged(BR.commonViewVisibility)
    }
}