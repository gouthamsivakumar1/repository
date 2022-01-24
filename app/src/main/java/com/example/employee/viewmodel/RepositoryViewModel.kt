package com.example.employee.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.employee.model.RepositoryDetailsResponse
import com.example.employee.repository.DetailsRepository


class RepositoryViewModel(private val mRepository: DetailsRepository) : ViewModel() {
    private var mKeyword: String? = ""


    /**
     * fun  get to fetch data from Api
     */
    fun getDetails(keyword: String) = mRepository.getRepositories(keyword)


    /**
     * fun  to filter  query related data
     */
    fun filterData(query: String?): LiveData<List<RepositoryDetailsResponse>>? {
        return mRepository.getLocalList(query)
    }

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