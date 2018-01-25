package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNavAboutBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_content, 1);
        sViewsWithIds.put(R.id.iv_icon, 2);
        sViewsWithIds.put(R.id.tv_version_name, 3);
        sViewsWithIds.put(R.id.tv_new_version, 4);
        sViewsWithIds.put(R.id.tv_function, 5);
        sViewsWithIds.put(R.id.tv_about_star, 6);
        sViewsWithIds.put(R.id.tv_gankio, 7);
        sViewsWithIds.put(R.id.tv_douban, 8);
    }
    // views
    @NonNull
    public final android.widget.RelativeLayout activityNavAbout;
    @NonNull
    public final android.widget.ImageView ivIcon;
    @NonNull
    public final android.widget.LinearLayout llContent;
    @NonNull
    public final android.widget.TextView tvAboutStar;
    @NonNull
    public final android.widget.TextView tvDouban;
    @NonNull
    public final android.widget.TextView tvFunction;
    @NonNull
    public final android.widget.TextView tvGankio;
    @NonNull
    public final android.widget.TextView tvNewVersion;
    @NonNull
    public final android.widget.TextView tvVersionName;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNavAboutBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.activityNavAbout = (android.widget.RelativeLayout) bindings[0];
        this.activityNavAbout.setTag(null);
        this.ivIcon = (android.widget.ImageView) bindings[2];
        this.llContent = (android.widget.LinearLayout) bindings[1];
        this.tvAboutStar = (android.widget.TextView) bindings[6];
        this.tvDouban = (android.widget.TextView) bindings[8];
        this.tvFunction = (android.widget.TextView) bindings[5];
        this.tvGankio = (android.widget.TextView) bindings[7];
        this.tvNewVersion = (android.widget.TextView) bindings[4];
        this.tvVersionName = (android.widget.TextView) bindings[3];
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
    public static ActivityNavAboutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavAboutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityNavAboutBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_nav_about, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityNavAboutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavAboutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_nav_about, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityNavAboutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavAboutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_nav_about_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityNavAboutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}