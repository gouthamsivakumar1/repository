package com.example.employee.viewObserver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/employee/viewObserver/DetailsViewObserver;", "Landroidx/databinding/BaseObservable;", "()V", "mIsError", "", "mIsProgressing", "mModel", "Lcom/example/employee/model/RepositoryDetailsResponse;", "getCommonViewVisibility", "", "getErrorViewVisibility", "getProgressBarVisibility", "setData", "", "data", "setErrorVisibility", "condition", "setProgressVisibility", "app_debug"})
public final class DetailsViewObserver extends androidx.databinding.BaseObservable {
    private com.example.employee.model.RepositoryDetailsResponse mModel;
    private boolean mIsProgressing = false;
    private boolean mIsError = false;
    
    public DetailsViewObserver() {
        super();
    }
    
    /**
     * Progress Visibility
     */
    @androidx.databinding.Bindable()
    public final int getProgressBarVisibility() {
        return 0;
    }
    
    /**
     * Error view Visibility
     */
    @androidx.databinding.Bindable()
    public final int getErrorViewVisibility() {
        return 0;
    }
    
    /**
     * Common view Visibility
     */
    @androidx.databinding.Bindable()
    public final int getCommonViewVisibility() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.employee.model.RepositoryDetailsResponse data) {
    }
    
    public final void setProgressVisibility(boolean condition) {
    }
    
    public final void setErrorVisibility(boolean condition) {
    }
}