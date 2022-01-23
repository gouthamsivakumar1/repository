package com.example.employee.utils;

import java.lang.System;

/**
 * Custom class to implement Jetpack arch
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0005H%J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0003J\u0017\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/employee/utils/NetworkOnlyResource;", "ResultType", "", "()V", "asLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/employee/utils/Resource;", "getAsLiveData", "()Landroidx/lifecycle/LiveData;", "result", "Landroidx/lifecycle/MediatorLiveData;", "createCall", "Lcom/example/employee/api/ApiResponse;", "fetchFromNetwork", "", "onFetchFailed", "saveCallResult", "item", "(Ljava/lang/Object;)V", "saveResultAndReInit", "response", "app_debug"})
public abstract class NetworkOnlyResource<ResultType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.example.employee.utils.Resource<ResultType>> result = null;
    
    public NetworkOnlyResource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.employee.utils.Resource<ResultType>> getAsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.example.employee.api.ApiResponse<ResultType>> createCall();
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveCallResult(@org.jetbrains.annotations.Nullable()
    ResultType item);
    
    @androidx.annotation.MainThread()
    private final void onFetchFailed() {
    }
    
    private final void fetchFromNetwork() {
    }
    
    @androidx.annotation.MainThread()
    private final void saveResultAndReInit(com.example.employee.api.ApiResponse<ResultType> response) {
    }
}