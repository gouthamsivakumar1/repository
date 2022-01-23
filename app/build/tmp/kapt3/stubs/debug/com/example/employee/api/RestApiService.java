package com.example.employee.api;

import java.lang.System;

/**
 * Retrofit API Library builder class
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/employee/api/RestApiService;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "T", "retrofit", "Lretrofit2/Retrofit;", "service", "Ljava/lang/Class;", "(Lretrofit2/Retrofit;Ljava/lang/Class;)Ljava/lang/Object;", "getClient", "Lokhttp3/OkHttpClient;", "getGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "getLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getRetrofitInstance", "handleError", "", "response", "Lokhttp3/Response;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class RestApiService {
    private final android.content.Context mContext = null;
    
    public RestApiService(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    /**
     * Retrofit singleton instance builder
     */
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofitInstance() {
        return null;
    }
    
    /**
     * Json Response converter
     */
    private final retrofit2.converter.gson.GsonConverterFactory getGsonConverterFactory() {
        return null;
    }
    
    /**
     * Log API Calls
     */
    private final okhttp3.logging.HttpLoggingInterceptor getLoggingInterceptor() {
        return null;
    }
    
    /**
     * Add api header interceptors
     */
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    /**
     * Set accesstoken to header
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final boolean handleError(okhttp3.Response response) {
        return false;
    }
    
    /**
     * Build API call EndPoints
     */
    public final <T extends java.lang.Object>T create(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> service) {
        return null;
    }
}