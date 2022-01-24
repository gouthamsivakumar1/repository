// Generated by data binding compiler. Do not edit!
package com.example.employee.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.employee.R;
import com.example.employee.viewObserver.DetailsViewObserver;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnRetry;

  @NonNull
  public final ConstraintLayout clSearch;

  @NonNull
  public final ProgressBar progressBarVisibility;

  @NonNull
  public final SwipeRefreshLayout rlRefresh;

  @NonNull
  public final RecyclerView rvRepository;

  @NonNull
  public final SearchView svSearch;

  @NonNull
  public final AppCompatTextView tvNoInternet;

  @Bindable
  protected DetailsViewObserver mData;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnRetry, ConstraintLayout clSearch, ProgressBar progressBarVisibility,
      SwipeRefreshLayout rlRefresh, RecyclerView rvRepository, SearchView svSearch,
      AppCompatTextView tvNoInternet) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRetry = btnRetry;
    this.clSearch = clSearch;
    this.progressBarVisibility = progressBarVisibility;
    this.rlRefresh = rlRefresh;
    this.rvRepository = rvRepository;
    this.svSearch = svSearch;
    this.tvNoInternet = tvNoInternet;
  }

  public abstract void setData(@Nullable DetailsViewObserver data);

  @Nullable
  public DetailsViewObserver getData() {
    return mData;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
