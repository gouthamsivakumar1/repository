package com.example.employee.viewmodel

import androidx.lifecycle.ViewModel
import com.example.employee.model.RepositoryDetailsResponse
import com.example.employee.repository.DetailsRepository


class RepositoryViewModel(private val mRepository: DetailsRepository) : ViewModel() {
    private var mData: Array<RepositoryDetailsResponse> = arrayOf()
    private var mKeyword: String? = ""


    /**
     * fun  get to fetch data from Api
     */
    fun getDetails(name: String) = mRepository.getList(name)


    /**
     * fun to  filter query related data
     */
    fun setRepositoryData(data: Array<RepositoryDetailsResponse>) {
        mData = data
    }

    /**
     * fun  to filter  query related data
     */
//    fun filterData(query: String): List<RepositoryDetailsResponse>? {
//        return mRepository.getLocalList(query).value
//    }

    /**
     * fun to set search keyword
     */
    fun setKeyword(query: String?) {
        mKeyword = query
    }

    /**
     *  fun to get search  keyword
     */
    fun getKeyword(): String? = mKeyword


}