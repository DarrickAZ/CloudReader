package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySlideScroolViewBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"activity_movie_header"},
            new int[] {2},
            new int[] {R.layout.activity_movie_header});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.discoverScrollView, 3);
        sViewsWithIds.put(R.id.rcvGoodsList, 4);
        sViewsWithIds.put(R.id.rlHead, 5);
        sViewsWithIds.put(R.id.title_tool_bar, 6);
        sViewsWithIds.put(R.id.tv_title, 7);
        sViewsWithIds.put(R.id.tv_subtitle, 8);
    }
    // views
    @NonNull
    public final com.example.jingbin.cloudreader.view.DiscoverScrollView discoverScrollView;
    @Nullable
    public final com.example.jingbin.cloudreader.databinding.ActivityMovieHeaderBinding include;
    @NonNull
    public final android.widget.LinearLayout llHeader;
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    public final android.support.v7.widget.RecyclerView rcvGoodsList;
    @NonNull
    public final android.widget.RelativeLayout rlHead;
    @NonNull
    public final android.support.v7.widget.Toolbar titleToolBar;
    @NonNull
    public final android.widget.TextView tvSubtitle;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySlideScroolViewBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.discoverScrollView = (com.example.jingbin.cloudreader.view.DiscoverScrollView) bindings[3];
        this.include = (com.example.jingbin.cloudreader.databinding.ActivityMovieHeaderBinding) bindings[2];
        setContainedBinding(this.include);
        this.llHeader = (android.widget.LinearLayout) bindings[1];
        this.llHeader.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rcvGoodsList = (android.support.v7.widget.RecyclerView) bindings[4];
        this.rlHead = (android.widget.RelativeLayout) bindings[5];
        this.titleToolBar = (android.support.v7.widget.Toolbar) bindings[6];
        this.tvSubtitle = (android.widget.TextView) bindings[8];
        this.tvTitle = (android.widget.TextView) bindings[7];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
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
            case 0 :
                return onChangeInclude((com.example.jingbin.cloudreader.databinding.ActivityMovieHeaderBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude(com.example.jingbin.cloudreader.databinding.ActivityMovieHeaderBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivitySlideScroolViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideScroolViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySlideScroolViewBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_slide_scrool_view, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivitySlideScroolViewBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideScroolViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_slide_scrool_view, null, false), bindingComponent);
    }
    @NonNull
    public static ActivitySlideScroolViewBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideScroolViewBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_slide_scrool_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySlideScroolViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): include
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}