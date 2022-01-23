package com.example.employee.api

import com.example.employee.model.ResponseError
import com.google.gson.Gson
import com.example.employee.model.ResponseErrorBody
import retrofit2.Response
import java.io.IOException

/**
 * Base Api response model
 */
class ApiResponse<T> {

    val code: Int
    val body: T?
    var responseErrorBody: ResponseErrorBody? = null
    val error: Throwable?

    val isSuccessful: Boolean
        get() = code in 200..299


    constructor(error: Throwable) {
        code = 500
        body = null
        this.error = error
    }

    constructor(response: Response<T>) {
        code = response.code()
        if (response.isSuccessful) {
            body = response.body()
            error = null
        } else {
            var message: String? = null
            if (response.errorBody() != null) {
                try {
                    message = response.errorBody()!!.string()
                } catch (ignored: IOException) {
                }
            }
            if (message == null || message.trim { it <= ' ' }.isEmpty()) {
                message = response.message()
            }
            error = IOException(message)
            responseErrorBody = Gson().fromJson(message, ResponseError::class.java).error
            body = null
        }
    }
}