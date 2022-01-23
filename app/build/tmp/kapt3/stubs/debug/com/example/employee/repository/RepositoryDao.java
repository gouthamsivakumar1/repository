package com.example.employee.repository;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/employee/repository/RepositoryDao;", "", "getList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/employee/model/RepositoryDetailsResponse;", "recipe", "", "insert", "", "repository", "app_debug"})
public abstract interface RepositoryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.employee.model.RepositoryDetailsResponse repository);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from RepositoryDetailsResponse Where name Like:recipe||\'%\' ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.employee.model.RepositoryDetailsResponse>> getList(@org.jetbrains.annotations.NotNull()
    java.lang.String recipe);
}