package com.example.employee.repository;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000e0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/employee/repository/DetailsRepository;", "", "mRestAPIEntity", "Lcom/example/employee/api/RestAPIEntity;", "mAppDatabase", "Lcom/example/employee/repository/AppDatabase;", "(Lcom/example/employee/api/RestAPIEntity;Lcom/example/employee/repository/AppDatabase;)V", "getLocalList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "keyword", "", "getRepositories", "Lcom/example/employee/utils/Resource;", "", "app_debug"})
public final class DetailsRepository {
    private final com.example.employee.api.RestAPIEntity mRestAPIEntity = null;
    private final com.example.employee.repository.AppDatabase mAppDatabase = null;
    
    public DetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.employee.api.RestAPIEntity mRestAPIEntity, @org.jetbrains.annotations.NotNull()
    com.example.employee.repository.AppDatabase mAppDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.employee.utils.Resource<com.example.employee.model.RepositoryDetailsResponse[]>> getRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.employee.model.RepositoryDetailsResponse>> getLocalList(@org.jetbrains.annotations.Nullable()
    java.lang.String keyword) {
        return null;
    }
}