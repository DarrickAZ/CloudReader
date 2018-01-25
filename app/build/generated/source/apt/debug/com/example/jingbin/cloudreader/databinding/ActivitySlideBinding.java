package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySlideBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 1);
        sViewsWithIds.put(R.id.activity_movie, 2);
        sViewsWithIds.put(R.id.img_item_bg, 3);
        sViewsWithIds.put(R.id.title_tool_bar, 4);
        sViewsWithIds.put(R.id.tv_title, 5);
    }
    // views
    @NonNull
    public final android.widget.LinearLayout activityMovie;
    @NonNull
    public final android.widget.FrameLayout activitySlide;
    @NonNull
    public final android.widget.ImageView imgItemBg;
    @NonNull
    public final com.example.jingbin.cloudreader.view.DiscoverScrollView scrollView;
    @NonNull
    public final android.support.v7.widget.Toolbar titleToolBar;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySlideBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.activityMovie = (android.widget.LinearLayout) bindings[2];
        this.activitySlide = (android.widget.FrameLayout) bindings[0];
        this.activitySlide.setTag(null);
        this.imgItemBg = (android.widget.ImageView) bindings[3];
        this.scrollView = (com.example.jingbin.cloudreader.view.DiscoverScrollView) bindings[1];
        this.titleToolBar = (android.support.v7.widget.Toolbar) bindings[4];
        this.tvTitle = (android.widget.TextView) bindings[5];
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
    public static ActivitySlideBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySlideBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_slide, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivitySlideBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_slide, null, false), bindingComponent);
    }
    @NonNull
    public static ActivitySlideBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_slide_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySlideBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}