package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNavDeedBackBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_nav_deed_back, 1);
        sViewsWithIds.put(R.id.tv_issues, 2);
        sViewsWithIds.put(R.id.tv_faq, 3);
        sViewsWithIds.put(R.id.tv_qq, 4);
        sViewsWithIds.put(R.id.tv_email, 5);
        sViewsWithIds.put(R.id.tv_jianshu, 6);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout activityNavDeedBack;
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    public final android.widget.TextView tvEmail;
    @NonNull
    public final android.widget.TextView tvFaq;
    @NonNull
    public final android.widget.TextView tvIssues;
    @NonNull
    public final android.widget.TextView tvJianshu;
    @NonNull
    public final android.widget.TextView tvQq;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNavDeedBackBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.activityNavDeedBack = (android.widget.LinearLayout) bindings[1];
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail = (android.widget.TextView) bindings[5];
        this.tvFaq = (android.widget.TextView) bindings[3];
        this.tvIssues = (android.widget.TextView) bindings[2];
        this.tvJianshu = (android.widget.TextView) bindings[6];
        this.tvQq = (android.widget.TextView) bindings[4];
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
    public static ActivityNavDeedBackBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavDeedBackBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityNavDeedBackBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_nav_deed_back, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityNavDeedBackBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavDeedBackBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_nav_deed_back, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityNavDeedBackBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityNavDeedBackBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_nav_deed_back_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityNavDeedBackBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}