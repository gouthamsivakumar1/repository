package com.example.employee.utils;

import java.lang.System;

/**
 * Data Resource type
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u001aB=\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/employee/utils/PagedResource;", "T", "TH", "", "status", "Lcom/example/employee/utils/PagedStatus;", "code", "", "pageList", "Landroidx/lifecycle/LiveData;", "result", "exception", "Lcom/example/employee/utils/AppException;", "(Lcom/example/employee/utils/PagedStatus;Ljava/lang/Integer;Landroidx/lifecycle/LiveData;Ljava/lang/Object;Lcom/example/employee/utils/AppException;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getException", "()Lcom/example/employee/utils/AppException;", "getPageList", "()Landroidx/lifecycle/LiveData;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStatus", "()Lcom/example/employee/utils/PagedStatus;", "Companion", "app_debug"})
public final class PagedResource<T extends java.lang.Object, TH extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.employee.utils.PagedStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.LiveData<T> pageList = null;
    @org.jetbrains.annotations.Nullable()
    private final TH result = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.employee.utils.AppException exception = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.employee.utils.PagedResource.Companion Companion = null;
    
    private PagedResource(com.example.employee.utils.PagedStatus status, java.lang.Integer code, androidx.lifecycle.LiveData<T> pageList, TH result, com.example.employee.utils.AppException exception) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.employee.utils.PagedStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<T> getPageList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final TH getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.utils.AppException getException() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006\u00a2\u0006\u0002\u0010\bJ@\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/employee/utils/PagedResource$Companion;", "", "()V", "complete", "Lcom/example/employee/utils/PagedResource;", "T", "TH", "response", "(Ljava/lang/Object;)Lcom/example/employee/utils/PagedResource;", "error", "exception", "Lcom/example/employee/utils/AppException;", "pageList", "Landroidx/lifecycle/LiveData;", "code", "", "page", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, TH extends java.lang.Object>com.example.employee.utils.PagedResource<T, TH> page(@org.jetbrains.annotations.Nullable()
        androidx.lifecycle.LiveData<T> pageList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, TH extends java.lang.Object>com.example.employee.utils.PagedResource<T, TH> error(@org.jetbrains.annotations.Nullable()
        com.example.employee.utils.AppException exception, @org.jetbrains.annotations.Nullable()
        androidx.lifecycle.LiveData<T> pageList, int code) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object, TH extends java.lang.Object>com.example.employee.utils.PagedResource<T, TH> complete(@org.jetbrains.annotations.Nullable()
        TH response) {
            return null;
        }
    }
}