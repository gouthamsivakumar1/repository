package com.example.employee.databinding;
import com.example.employee.R;
import com.example.employee.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clSearch, 4);
        sViewsWithIds.put(R.id.svSearch, 5);
        sViewsWithIds.put(R.id.rlRefresh, 6);
        sViewsWithIds.put(R.id.rvRepository, 7);
        sViewsWithIds.put(R.id.tvNoInternet, 8);
        sViewsWithIds.put(R.id.btnRetry, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.SearchView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.progressBarVisibility.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.example.employee.viewObserver.DetailsViewObserver) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.example.employee.viewObserver.DetailsViewObserver Data) {
        updateRegistration(0, Data);
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeData((com.example.employee.viewObserver.DetailsViewObserver) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(com.example.employee.viewObserver.DetailsViewObserver Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.commonViewVisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.progressBarVisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.errorViewVisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int dataCommonViewVisibility = 0;
        int dataErrorViewVisibility = 0;
        int dataProgressBarVisibility = 0;
        com.example.employee.viewObserver.DetailsViewObserver data = mData;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x13L) != 0) {

                    if (data != null) {
                        // read data.commonViewVisibility
                        dataCommonViewVisibility = data.getCommonViewVisibility();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (data != null) {
                        // read data.errorViewVisibility
                        dataErrorViewVisibility = data.getErrorViewVisibility();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (data != null) {
                        // read data.progressBarVisibility
                        dataProgressBarVisibility = data.getProgressBarVisibility();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataCommonViewVisibility);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(dataErrorViewVisibility);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.progressBarVisibility.setVisibility(dataProgressBarVisibility);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): data.commonViewVisibility
        flag 2 (0x3L): data.progressBarVisibility
        flag 3 (0x4L): data.errorViewVisibility
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}