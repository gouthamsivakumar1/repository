package com.example.employee.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r0\b2\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/employee/viewmodel/RepositoryViewModel;", "Landroidx/lifecycle/ViewModel;", "mRepository", "Lcom/example/employee/repository/DetailsRepository;", "(Lcom/example/employee/repository/DetailsRepository;)V", "mKeyword", "", "filterData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "query", "getDetails", "Lcom/example/employee/utils/Resource;", "", "keyword", "getKeyword", "setKeyword", "", "app_debug"})
public final class RepositoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.employee.repository.DetailsRepository mRepository = null;
    private java.lang.String mKeyword = "";
    
    public RepositoryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.employee.repository.DetailsRepository mRepository) {
        super();
    }
    
    /**
     * fun  get to fetch data from Api
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.employee.utils.Resource<com.example.employee.model.RepositoryDetailsResponse[]>> getDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
        return null;
    }
    
    /**
     * fun  to filter  query related data
     */
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.employee.model.RepositoryDetailsResponse>> filterData(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    /**
     * fun to set search keyword
     */
    public final void setKeyword(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    /**
     * fun to get search  keyword
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeyword() {
        return null;
    }
}