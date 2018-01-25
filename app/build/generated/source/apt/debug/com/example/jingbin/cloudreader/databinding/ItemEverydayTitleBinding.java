package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEverydayTitleBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_line, 1);
        sViewsWithIds.put(R.id.rl_title, 2);
        sViewsWithIds.put(R.id.iv_title_type, 3);
        sViewsWithIds.put(R.id.tv_title_type, 4);
        sViewsWithIds.put(R.id.ll_title_more, 5);
        sViewsWithIds.put(R.id.tv_more, 6);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivTitleType;
    @NonNull
    public final android.widget.LinearLayout ll;
    @NonNull
    public final android.widget.LinearLayout llTitleMore;
    @NonNull
    public final android.widget.RelativeLayout rlTitle;
    @NonNull
    public final android.widget.TextView tvMore;
    @NonNull
    public final android.widget.TextView tvTitleType;
    @NonNull
    public final android.view.View viewLine;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEverydayTitleBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.ivTitleType = (android.widget.ImageView) bindings[3];
        this.ll = (android.widget.LinearLayout) bindings[0];
        this.ll.setTag(null);
        this.llTitleMore = (android.widget.LinearLayout) bindings[5];
        this.rlTitle = (android.widget.RelativeLayout) bindings[2];
        this.tvMore = (android.widget.TextView) bindings[6];
        this.tvTitleType = (android.widget.TextView) bindings[4];
        this.viewLine = (android.view.View) bindings[1];
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
    public static ItemEverydayTitleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTitleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEverydayTitleBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_everyday_title, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEverydayTitleBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTitleBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_everyday_title, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEverydayTitleBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTitleBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_everyday_title_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEverydayTitleBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}