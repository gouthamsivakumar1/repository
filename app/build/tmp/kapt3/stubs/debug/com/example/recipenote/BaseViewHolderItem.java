package com.example.recipenote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0007H\u0004J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/recipenote/BaseViewHolderItem;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentPosition", "", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "bind", "", "position", "(Ljava/lang/Object;I)V", "getCurrentPosition", "onBind", "onConstruct", "onCreated", "app_debug"})
public abstract class BaseViewHolderItem<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.Nullable()
    private T data;
    private int currentPosition = 0;
    
    public BaseViewHolderItem(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final T getData() {
        return null;
    }
    
    protected final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    private final void onConstruct() {
    }
    
    public final void bind(T data, int position) {
    }
    
    protected final int getCurrentPosition() {
        return 0;
    }
    
    public abstract void onCreated();
    
    public abstract void onBind(T data);
}