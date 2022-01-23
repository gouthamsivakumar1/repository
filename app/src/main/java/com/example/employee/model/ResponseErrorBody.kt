package com.example.employee.model

data class ResponseErrorBody(
    val  statusCode : String ?,
    val  message : String ?

)

data class ResponseError(
    val  error : ResponseErrorBody?
)