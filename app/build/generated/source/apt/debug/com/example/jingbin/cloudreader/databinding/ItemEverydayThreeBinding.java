package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEverydayThreeBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_three_one_one, 1);
        sViewsWithIds.put(R.id.iv_three_one_one, 2);
        sViewsWithIds.put(R.id.tv_three_one_one_title, 3);
        sViewsWithIds.put(R.id.ll_three_one_two, 4);
        sViewsWithIds.put(R.id.iv_three_one_two, 5);
        sViewsWithIds.put(R.id.tv_three_one_two_title, 6);
        sViewsWithIds.put(R.id.ll_three_one_three, 7);
        sViewsWithIds.put(R.id.iv_three_one_three, 8);
        sViewsWithIds.put(R.id.tv_three_one_three_title, 9);
    }
    // views
    @NonNull
    public final android.widget.ImageView ivThreeOneOne;
    @NonNull
    public final android.widget.ImageView ivThreeOneThree;
    @NonNull
    public final android.widget.ImageView ivThreeOneTwo;
    @NonNull
    public final android.widget.LinearLayout llThreeOne;
    @NonNull
    public final android.widget.LinearLayout llThreeOneOne;
    @NonNull
    public final android.widget.LinearLayout llThreeOneThree;
    @NonNull
    public final android.widget.LinearLayout llThreeOneTwo;
    @NonNull
    public final android.widget.TextView tvThreeOneOneTitle;
    @NonNull
    public final android.widget.TextView tvThreeOneThreeTitle;
    @NonNull
    public final android.widget.TextView tvThreeOneTwoTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEverydayThreeBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.ivThreeOneOne = (android.widget.ImageView) bindings[2];
        this.ivThreeOneThree = (android.widget.ImageView) bindings[8];
        this.ivThreeOneTwo = (android.widget.ImageView) bindings[5];
        this.llThreeOne = (android.widget.LinearLayout) bindings[0];
        this.llThreeOne.setTag(null);
        this.llThreeOneOne = (android.widget.LinearLayout) bindings[1];
        this.llThreeOneThree = (android.widget.LinearLayout) bindings[7];
        this.llThreeOneTwo = (android.widget.LinearLayout) bindings[4];
        this.tvThreeOneOneTitle = (android.widget.TextView) bindings[3];
        this.tvThreeOneThreeTitle = (android.widget.TextView) bindings[9];
        this.tvThreeOneTwoTitle = (android.widget.TextView) bindings[6];
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
    public static ItemEverydayThreeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayThreeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemEverydayThreeBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.item_everyday_three, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemEverydayThreeBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayThreeBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.item_everyday_three, null, false), bindingComponent);
    }
    @NonNull
    public static ItemEverydayThreeBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemEverydayThreeBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_everyday_three_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemEverydayThreeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}