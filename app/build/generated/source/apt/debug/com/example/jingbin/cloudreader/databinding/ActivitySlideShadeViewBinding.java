package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySlideShadeViewBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"header_slide_shape"},
            new int[] {2},
            new int[] {R.layout.header_slide_shape});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nsv_scrollview, 3);
        sViewsWithIds.put(R.id.rl_title_head, 4);
        sViewsWithIds.put(R.id.iv_title_head_bg, 5);
        sViewsWithIds.put(R.id.title_tool_bar, 6);
        sViewsWithIds.put(R.id.tv_title, 7);
        sViewsWithIds.put(R.id.tv_subtitle, 8);
    }
    // views
    @Nullable
    public final com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding include;
    @NonNull
    public final android.widget.ImageView ivTitleHeadBg;
    @NonNull
    public final android.widget.LinearLayout llHeaderView;
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    public final com.example.jingbin.cloudreader.view.MyNestedScrollView nsvScrollview;
    @NonNull
    public final android.widget.RelativeLayout rlTitleHead;
    @NonNull
    public final android.support.v7.widget.Toolbar titleToolBar;
    @NonNull
    public final android.widget.TextView tvSubtitle;
    @NonNull
    public final android.widget.TextView tvTitle;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean mSubjectsBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySlideShadeViewBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds);
        this.include = (com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) bindings[2];
        setContainedBinding(this.include);
        this.ivTitleHeadBg = (android.widget.ImageView) bindings[5];
        this.llHeaderView = (android.widget.LinearLayout) bindings[1];
        this.llHeaderView.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nsvScrollview = (com.example.jingbin.cloudreader.view.MyNestedScrollView) bindings[3];
        this.rlTitleHead = (android.widget.RelativeLayout) bindings[4];
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
                mDirtyFlags = 0x4L;
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
        if (BR.subjectsBean == variableId) {
            setSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubjectsBean(@Nullable com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean SubjectsBean) {
        this.mSubjectsBean = SubjectsBean;
    }
    @Nullable
    public com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean getSubjectsBean() {
        return mSubjectsBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubjectsBean((com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean) object, fieldId);
            case 1 :
                return onChangeInclude((com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubjectsBean(com.example.jingbin.cloudreader.bean.moviechild.SubjectsBean SubjectsBean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInclude(com.example.jingbin.cloudreader.databinding.HeaderSlideShapeBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
    public static ActivitySlideShadeViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideShadeViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySlideShadeViewBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivitySlideShadeViewBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideShadeViewBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_slide_shade_view, null, false), bindingComponent);
    }
    @NonNull
    public static ActivitySlideShadeViewBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivitySlideShadeViewBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_slide_shade_view_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySlideShadeViewBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): subjectsBean
        flag 1 (0x2L): include
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}