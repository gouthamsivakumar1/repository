package com.example.employee.repository;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/employee/repository/DetailsRepository;", "", "mRestAPIEntity", "Lcom/example/employee/api/RestAPIEntity;", "(Lcom/example/employee/api/RestAPIEntity;)V", "getList", "Landroidx/lifecycle/LiveData;", "Lcom/example/employee/utils/Resource;", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "keyword", "", "app_debug"})
public final class DetailsRepository {
    private final com.example.employee.api.RestAPIEntity mRestAPIEntity = null;
    
    public DetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.employee.api.RestAPIEntity mRestAPIEntity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.employee.utils.Resource<com.example.employee.model.RepositoryDetailsResponse[]>> getList(@org.jetbrains.annotations.Nullable()
    java.lang.String keyword) {
        return null;
    }
}