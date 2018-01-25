package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NavHeaderMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_header_bg, 3);
        sViewsWithIds.put(R.id.iv_avatar, 4);
        sViewsWithIds.put(R.id.tv_username, 5);
        sViewsWithIds.put(R.id.tv_level, 6);
        sViewsWithIds.put(R.id.ll_nav_homepage, 7);
        sViewsWithIds.put(R.id.ll_nav_scan_download, 8);
        sViewsWithIds.put(R.id.ll_nav_deedback, 9);
        sViewsWithIds.put(R.id.ll_nav_about, 10);
        sViewsWithIds.put(R.id.line, 11);
        sViewsWithIds.put(R.id.ll_nav_login, 12);
        sViewsWithIds.put(R.id.ll_nav_exit, 13);
    }
    // views
    @NonNull
    public final android.support.v7.widget.SwitchCompat dayNightSwitch;
    @NonNull
    public final android.widget.ImageView ivAvatar;
    @NonNull
    public final android.view.View line;
    @NonNull
    public final android.widget.LinearLayout llHeaderBg;
    @NonNull
    public final android.widget.LinearLayout llNavAbout;
    @NonNull
    public final android.widget.LinearLayout llNavDeedback;
    @NonNull
    public final android.widget.LinearLayout llNavExit;
    @NonNull
    public final android.widget.LinearLayout llNavHomepage;
    @NonNull
    public final android.widget.LinearLayout llNavLogin;
    @NonNull
    public final android.widget.LinearLayout llNavScanDownload;
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    public final android.widget.TextView tvLevel;
    @NonNull
    public final android.widget.TextView tvUsername;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.MainActivity mListener;
    // values
    // listeners
    private OnClickListenerImpl mListenerOnNightModeClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public NavHeaderMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds);
        this.dayNightSwitch = (android.support.v7.widget.SwitchCompat) bindings[2];
        this.dayNightSwitch.setTag(null);
        this.ivAvatar = (android.widget.ImageView) bindings[4];
        this.line = (android.view.View) bindings[11];
        this.llHeaderBg = (android.widget.LinearLayout) bindings[3];
        this.llNavAbout = (android.widget.LinearLayout) bindings[10];
        this.llNavDeedback = (android.widget.LinearLayout) bindings[9];
        this.llNavExit = (android.widget.LinearLayout) bindings[13];
        this.llNavHomepage = (android.widget.LinearLayout) bindings[7];
        this.llNavLogin = (android.widget.LinearLayout) bindings[12];
        this.llNavScanDownload = (android.widget.LinearLayout) bindings[8];
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvLevel = (android.widget.TextView) bindings[6];
        this.tvUsername = (android.widget.TextView) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.listener == variableId) {
            setListener((com.example.jingbin.cloudreader.MainActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListener(@Nullable com.example.jingbin.cloudreader.MainActivity Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    @Nullable
    public com.example.jingbin.cloudreader.MainActivity getListener() {
        return mListener;
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
        com.example.jingbin.cloudreader.MainActivity listener = mListener;
        boolean listenerGetNightMode = false;
        android.view.View.OnClickListener listenerOnNightModeClickAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listener != null) {
                    // read listener.getNightMode
                    listenerGetNightMode = listener.getNightMode();
                    // read listener::onNightModeClick
                    listenerOnNightModeClickAndroidViewViewOnClickListener = (((mListenerOnNightModeClickAndroidViewViewOnClickListener == null) ? (mListenerOnNightModeClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnNightModeClickAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.dayNightSwitch, listenerGetNightMode);
            this.mboundView1.setOnClickListener(listenerOnNightModeClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.jingbin.cloudreader.MainActivity value;
        public OnClickListenerImpl setValue(com.example.jingbin.cloudreader.MainActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onNightModeClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static NavHeaderMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NavHeaderMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<NavHeaderMainBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.nav_header_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static NavHeaderMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NavHeaderMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.nav_header_main, null, false), bindingComponent);
    }
    @NonNull
    public static NavHeaderMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static NavHeaderMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/nav_header_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new NavHeaderMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): listener
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}