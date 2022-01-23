package com.example.employee.api;

import java.lang.System;

/**
 * Complete application API End-Point
 * Note some API have JSON Response, Some don't
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/employee/api/RestAPIEntity;", "", "getRepository", "Landroidx/lifecycle/LiveData;", "Lcom/example/employee/api/ApiResponse;", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "search", "", "app_debug"})
public abstract interface RestAPIEntity {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repositories")
    public abstract androidx.lifecycle.LiveData<com.example.employee.api.ApiResponse<com.example.employee.model.RepositoryDetailsResponse[]>> getRepository(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "search")
    java.lang.String search);
}