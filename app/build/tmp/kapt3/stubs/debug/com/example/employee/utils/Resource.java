package com.example.employee.utils;

import java.lang.System;

/**
 * Data Resource type
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0015*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0015B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/example/employee/utils/Resource;", "T", "", "status", "Lcom/example/employee/utils/NetworkStatus;", "code", "", "body", "exception", "Lcom/example/employee/utils/AppException;", "(Lcom/example/employee/utils/NetworkStatus;Ljava/lang/Integer;Ljava/lang/Object;Lcom/example/employee/utils/AppException;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getException", "()Lcom/example/employee/utils/AppException;", "getStatus", "()Lcom/example/employee/utils/NetworkStatus;", "Companion", "app_debug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.employee.utils.NetworkStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.Nullable()
    private final T body = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.employee.utils.AppException exception = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.employee.utils.Resource.Companion Companion = null;
    
    private Resource(com.example.employee.utils.NetworkStatus status, java.lang.Integer code, T body, com.example.employee.utils.AppException exception) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.employee.utils.NetworkStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.utils.AppException getException() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/employee/utils/Resource$Companion;", "", "()V", "error", "Lcom/example/employee/utils/Resource;", "T", "exception", "Lcom/example/employee/utils/AppException;", "data", "code", "", "(Lcom/example/employee/utils/AppException;Ljava/lang/Object;I)Lcom/example/employee/utils/Resource;", "loading", "(Ljava/lang/Object;)Lcom/example/employee/utils/Resource;", "success", "(Ljava/lang/Object;I)Lcom/example/employee/utils/Resource;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.employee.utils.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.employee.utils.Resource<T> error(@org.jetbrains.annotations.Nullable()
        com.example.employee.utils.AppException exception, @org.jetbrains.annotations.Nullable()
        T data, int code) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.example.employee.utils.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
    }
}