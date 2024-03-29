package com.example.employee.api

import androidx.lifecycle.LiveData
import com.example.employee.model.RepositoryDetailsResponse

import retrofit2.http.*


/**
 * Complete application API End-Point
 * Note some API have JSON Response, Some don't
 */

interface RestAPIEntity {

    @GET("repositories")
    fun getRepositories(@Query("name")name:String): LiveData<ApiResponse<Array<RepositoryDetailsResponse>>>
}