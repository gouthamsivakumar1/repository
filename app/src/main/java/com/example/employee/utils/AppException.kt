
package com.example.employee.utils

import com.example.employee.model.ResponseErrorBody

/**
 * API Exception class
 */
class AppException(t: Throwable?, private val responseErrorData: ResponseErrorBody?) : Exception(t){
    fun getErrorReponse() = responseErrorData
}