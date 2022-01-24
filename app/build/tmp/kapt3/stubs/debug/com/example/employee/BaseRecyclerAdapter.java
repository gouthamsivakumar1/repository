package com.example.employee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J%\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/example/employee/BaseRecyclerAdapter;", "T", "TH", "Lcom/example/employee/BaseViewHolderItem;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "createView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "viewType", "", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;I)Lcom/example/employee/BaseViewHolderItem;", "getItemCount", "onBindViewHolder", "", "holder", "position", "(Lcom/example/employee/BaseViewHolderItem;I)V", "onCreateViewHolder", "parent", "(Landroid/view/ViewGroup;I)Lcom/example/employee/BaseViewHolderItem;", "setData", "data", "", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends java.lang.Object, TH extends com.example.employee.BaseViewHolderItem<T>> extends androidx.recyclerview.widget.RecyclerView.Adapter<TH> {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<T> dataList;
    
    public BaseRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.ArrayList<T> getDataList() {
        return null;
    }
    
    protected final void setDataList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public TH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract TH createView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int viewType);
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    TH holder, int position) {
    }
}