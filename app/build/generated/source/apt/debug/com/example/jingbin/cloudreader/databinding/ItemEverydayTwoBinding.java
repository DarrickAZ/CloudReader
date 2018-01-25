package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEverydayTwoBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_two_one_one, 1);
        sViewsWithIds.put(R.id.iv_two_one_one, 2);
        sViewsWithIds.put(R.id.tv_two_one_one_title, 3);
        sViewsWithIds.put(R.id.ll_two_one_two, 4);
        sViewsWithIds.put(R.id.iv_two_one_two, 5);
        sViewsWithIds.put(R.id.tv_two_one_two_title, 6);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivTwoOneOne;
    @NonNull
    public final android.widget.ImageView ivTwoOneTwo;
    @NonNull
    public final android.widget.LinearLayout llTwoOne;
    @NonNull
    public final android.widget.LinearLayout llTwoOneOne;
    @NonNull
    public final android.widget.LinearLayout llTwoOneTwo;
    @NonNull
    public final android.widget.TextView tvTwoOneOneTitle;
    @NonNull
    public final android.widget.TextView tvTwoOneTwoTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEverydayTwoBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.ivTwoOneOne = (android.widget.ImageView) bindings[2];
        this.ivTwoOneTwo = (android.widget.ImageView) bindings[5];
        this.llTwoOne = (android.widget.LinearLayout) bindings[0];
        this.llTwoOne.setTag(null);
        this.llTwoOneOne = (android.widget.LinearLayout) bindings[1];
        this.llTwoOneTwo = (android.widget.LinearLayout) bindings[4];
        this.tvTwoOneOneTitle = (android.widget.TextView) bindings[3];
        this.tvTwoOneTwoTitle = (android.widget.TextView) bindings[6];
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
    public static ItemEverydayTwoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTwoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEverydayTwoBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_everyday_two, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEverydayTwoBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTwoBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_everyday_two, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEverydayTwoBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayTwoBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_everyday_two_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEverydayTwoBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}