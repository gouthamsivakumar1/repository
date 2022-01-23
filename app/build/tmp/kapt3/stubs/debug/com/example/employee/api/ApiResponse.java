package com.example.employee.api;

import java.lang.System;

/**
 * Base Api response model
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/employee/api/ApiResponse;", "T", "", "error", "", "(Ljava/lang/Throwable;)V", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "body", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "code", "", "getCode", "()I", "getError", "()Ljava/lang/Throwable;", "isSuccessful", "", "()Z", "responseErrorBody", "Lcom/example/employee/model/ResponseErrorBody;", "getResponseErrorBody", "()Lcom/example/employee/model/ResponseErrorBody;", "setResponseErrorBody", "(Lcom/example/employee/model/ResponseErrorBody;)V", "app_debug"})
public final class ApiResponse<T extends java.lang.Object> {
    private final int code = 0;
    @org.jetbrains.annotations.Nullable()
    private final T body = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.employee.model.ResponseErrorBody responseErrorBody;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.ResponseErrorBody getResponseErrorBody() {
        return null;
    }
    
    public final void setResponseErrorBody(@org.jetbrains.annotations.Nullable()
    com.example.employee.model.ResponseErrorBody p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
        super();
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
        super();
    }
}