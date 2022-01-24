package com.example.employee.view;

import java.lang.System;

@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/employee/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mAdapter", "Lcom/example/employee/view/adapter/RepositoryAdapter;", "mViewBinding", "Lcom/example/employee/databinding/ActivityMainBinding;", "mViewModel", "Lcom/example/employee/viewmodel/RepositoryViewModel;", "getMViewModel", "()Lcom/example/employee/viewmodel/RepositoryViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "mViewObserver", "Lcom/example/employee/viewObserver/DetailsViewObserver;", "fetchData", "", "keyword", "", "loadData", "query", "loadPullToRefreshFunctionality", "loadRetryButton", "Lio/reactivex/disposables/Disposable;", "loadSearchFunctionality", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy mViewModel$delegate = null;
    private final com.example.employee.view.adapter.RepositoryAdapter mAdapter = null;
    private com.example.employee.viewObserver.DetailsViewObserver mViewObserver;
    private com.example.employee.databinding.ActivityMainBinding mViewBinding;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.employee.viewmodel.RepositoryViewModel getMViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData(java.lang.String query) {
    }
    
    private final void loadSearchFunctionality() {
    }
    
    private final void loadPullToRefreshFunctionality() {
    }
    
    private final io.reactivex.disposables.Disposable loadRetryButton() {
        return null;
    }
    
    private final void setAdapter() {
    }
    
    private final void fetchData(java.lang.String keyword) {
    }
}