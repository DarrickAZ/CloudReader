package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHeaderBaseBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mns_base, 1);
        sViewsWithIds.put(R.id.header_container, 2);
        sViewsWithIds.put(R.id.container, 3);
        sViewsWithIds.put(R.id.ll_error_refresh, 4);
        sViewsWithIds.put(R.id.img_err, 5);
        sViewsWithIds.put(R.id.ll_progress_bar, 6);
        sViewsWithIds.put(R.id.img_progress, 7);
        sViewsWithIds.put(R.id.title_container, 8);
    }
    // views
    @NonNull
    public final android.widget.RelativeLayout container;
    @NonNull
    public final android.widget.RelativeLayout headerContainer;
    @NonNull
    public final android.widget.ImageView imgErr;
    @NonNull
    public final android.widget.ImageView imgProgress;
    @NonNull
    public final android.widget.LinearLayout llErrorRefresh;
    @NonNull
    public final android.widget.LinearLayout llProgressBar;
    @NonNull
    public final com.example.jingbin.cloudreader.view.MyNestedScrollView mnsBase;
    @NonNull
    public final android.widget.FrameLayout rlRoot;
    @NonNull
    public final android.widget.RelativeLayout titleContainer;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHeaderBaseBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.container = (android.widget.RelativeLayout) bindings[3];
        this.headerContainer = (android.widget.RelativeLayout) bindings[2];
        this.imgErr = (android.widget.ImageView) bindings[5];
        this.imgProgress = (android.widget.ImageView) bindings[7];
        this.llErrorRefresh = (android.widget.LinearLayout) bindings[4];
        this.llProgressBar = (android.widget.LinearLayout) bindings[6];
        this.mnsBase = (com.example.jingbin.cloudreader.view.MyNestedScrollView) bindings[1];
        this.rlRoot = (android.widget.FrameLayout) bindings[0];
        this.rlRoot.setTag(null);
        this.titleContainer = (android.widget.RelativeLayout) bindings[8];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityHeaderBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHeaderBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityHeaderBaseBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_header_base, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityHeaderBaseBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHeaderBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_header_base, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityHeaderBaseBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityHeaderBaseBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_header_base_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityHeaderBaseBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}