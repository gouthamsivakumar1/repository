package com.example.employee.databinding;
import com.example.employee.R;
import com.example.employee.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RepositoryListItemBindingImpl extends RepositoryListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.heading, 5);
        sViewsWithIds.put(R.id.heading_icon, 6);
        sViewsWithIds.put(R.id.rlBody, 7);
        sViewsWithIds.put(R.id.clLanguage, 8);
        sViewsWithIds.put(R.id.tvStars, 9);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RepositoryListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private RepositoryListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.cdRepository.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.tvDescription.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setData((com.example.employee.viewObserver.RepositoryItemViewObserver) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.example.employee.viewObserver.RepositoryItemViewObserver Data) {
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
                return onChangeData((com.example.employee.viewObserver.RepositoryItemViewObserver) object, fieldId);
        }
        return false;
    }
    private boolean onChangeData(com.example.employee.viewObserver.RepositoryItemViewObserver Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.title) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.description) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.language) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.starCount) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String dataTitle = null;
        java.lang.String dataLanguage = null;
        java.lang.Object dataStarCount = null;
        java.lang.String dataDescription = null;
        com.example.employee.viewObserver.RepositoryItemViewObserver data = mData;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (data != null) {
                        // read data.title
                        dataTitle = data.getTitle();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (data != null) {
                        // read data.language
                        dataLanguage = data.getLanguage();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (data != null) {
                        // read data.starCount
                        dataStarCount = data.getStarCount();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (data != null) {
                        // read data.description
                        dataDescription = data.getDescription();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataLanguage);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, (java.lang.CharSequence) dataStarCount);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, dataDescription);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): data.title
        flag 2 (0x3L): data.description
        flag 3 (0x4L): data.language
        flag 4 (0x5L): data.starCount
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}