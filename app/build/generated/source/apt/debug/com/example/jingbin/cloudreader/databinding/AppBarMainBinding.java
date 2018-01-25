package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AppBarMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_status, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.ll_title_menu, 3);
        sViewsWithIds.put(R.id.iv_title_menu, 4);
        sViewsWithIds.put(R.id.iv_title_gank, 5);
        sViewsWithIds.put(R.id.iv_title_one, 6);
        sViewsWithIds.put(R.id.iv_title_dou, 7);
        sViewsWithIds.put(R.id.vp_content, 8);
        sViewsWithIds.put(R.id.fab, 9);
    }
    // views
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    public final android.widget.ImageView ivTitleDou;
    @NonNull
    public final android.widget.ImageView ivTitleGank;
    @NonNull
    public final android.widget.ImageView ivTitleMenu;
    @NonNull
    public final android.widget.ImageView ivTitleOne;
    @NonNull
    public final android.widget.FrameLayout llTitleMenu;
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.Toolbar toolbar;
    @NonNull
    public final android.view.View viewStatus;
    @NonNull
    public final android.support.v4.view.ViewPager vpContent;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AppBarMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[9];
        this.ivTitleDou = (android.widget.ImageView) bindings[7];
        this.ivTitleGank = (android.widget.ImageView) bindings[5];
        this.ivTitleMenu = (android.widget.ImageView) bindings[4];
        this.ivTitleOne = (android.widget.ImageView) bindings[6];
        this.llTitleMenu = (android.widget.FrameLayout) bindings[3];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[2];
        this.viewStatus = (android.view.View) bindings[1];
        this.vpContent = (android.support.v4.view.ViewPager) bindings[8];
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
    public static AppBarMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppBarMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<AppBarMainBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.app_bar_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static AppBarMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppBarMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.app_bar_main, null, false), bindingComponent);
    }
    @NonNull
    public static AppBarMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static AppBarMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/app_bar_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new AppBarMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}