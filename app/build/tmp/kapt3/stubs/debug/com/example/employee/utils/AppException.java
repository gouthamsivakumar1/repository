package com.example.employee.utils;

import java.lang.System;

/**
 * API Exception class
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/employee/utils/AppException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "t", "", "responseErrorData", "Lcom/example/employee/model/ResponseErrorBody;", "(Ljava/lang/Throwable;Lcom/example/employee/model/ResponseErrorBody;)V", "getErrorReponse", "app_debug"})
public final class AppException extends java.lang.Exception {
    private final com.example.employee.model.ResponseErrorBody responseErrorData = null;
    
    public AppException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.ResponseErrorBody responseErrorData) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.ResponseErrorBody getErrorReponse() {
        return null;
    }
}