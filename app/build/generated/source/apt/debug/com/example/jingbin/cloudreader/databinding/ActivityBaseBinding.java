package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBaseBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_root, 1);
        sViewsWithIds.put(R.id.tool_bar, 2);
        sViewsWithIds.put(R.id.container, 3);
        sViewsWithIds.put(R.id.ll_error_refresh, 4);
        sViewsWithIds.put(R.id.img_err, 5);
        sViewsWithIds.put(R.id.ll_progress_bar, 6);
        sViewsWithIds.put(R.id.img_progress, 7);
    }
    // views
    @NonNull
    public final android.widget.RelativeLayout container;
    @NonNull
    public final android.widget.ImageView imgErr;
    @NonNull
    public final android.widget.ImageView imgProgress;
    @NonNull
    public final android.widget.LinearLayout llErrorRefresh;
    @NonNull
    public final android.widget.LinearLayout llProgressBar;
    @NonNull
    public final android.widget.LinearLayout llRoot;
    @NonNull
    public final android.widget.FrameLayout rlRootRoot;
    @NonNull
    public final android.support.v7.widget.Toolbar toolBar;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBaseBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.container = (android.widget.RelativeLayout) bindings[3];
        this.imgErr = (android.widget.ImageView) bindings[5];
        this.imgProgress = (android.widget.ImageView) bindings[7];
        this.llErrorRefresh = (android.widget.LinearLayout) bindings[4];
        this.llProgressBar = (android.widget.LinearLayout) bindings[6];
        this.llRoot = (android.widget.LinearLayout) bindings[1];
        this.rlRootRoot = (android.widget.FrameLayout) bindings[0];
        this.rlRootRoot.setTag(null);
        this.toolBar = (android.support.v7.widget.Toolbar) bindings[2];
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
    public static ActivityBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityBaseBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_base, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityBaseBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBaseBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_base, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityBaseBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityBaseBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_base_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityBaseBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}