package com.example.employee.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\r0\f2\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\nJ\u0019\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0015R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/employee/viewmodel/RepositoryViewModel;", "Landroidx/lifecycle/ViewModel;", "mRepository", "Lcom/example/employee/repository/DetailsRepository;", "(Lcom/example/employee/repository/DetailsRepository;)V", "mData", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "[Lcom/example/employee/model/RepositoryDetailsResponse;", "mKeyword", "", "getDetails", "Landroidx/lifecycle/LiveData;", "Lcom/example/employee/utils/Resource;", "name", "getKeyword", "setKeyword", "", "query", "setRepositoryData", "data", "([Lcom/example/employee/model/RepositoryDetailsResponse;)V", "app_debug"})
public final class RepositoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.employee.repository.DetailsRepository mRepository = null;
    private com.example.employee.model.RepositoryDetailsResponse[] mData = {};
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
    java.lang.String name) {
        return null;
    }
    
    /**
     * fun to  filter query related data
     */
    public final void setRepositoryData(@org.jetbrains.annotations.NotNull()
    com.example.employee.model.RepositoryDetailsResponse[] data) {
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