package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOneMovieDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.xrv_cast, 3);
    }
    // views
    @NonNull
    public final android.widget.FrameLayout activityOneMovieDetail;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    public final android.widget.TextView tvOneTitle;
    @NonNull
    public final com.example.xrecyclerview.XRecyclerView xrvCast;
    // variables
    @Nullable
    private com.example.jingbin.cloudreader.bean.MovieDetailBean mBean;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOneMovieDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds);
        this.activityOneMovieDetail = (android.widget.FrameLayout) bindings[0];
        this.activityOneMovieDetail.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvOneTitle = (android.widget.TextView) bindings[1];
        this.tvOneTitle.setTag(null);
        this.xrvCast = (com.example.xrecyclerview.XRecyclerView) bindings[3];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.bean == variableId) {
            setBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBean(@Nullable com.example.jingbin.cloudreader.bean.MovieDetailBean Bean) {
        updateRegistration(0, Bean);
        this.mBean = Bean;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bean);
        super.requestRebind();
    }
    @Nullable
    public com.example.jingbin.cloudreader.bean.MovieDetailBean getBean() {
        return mBean;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBean((com.example.jingbin.cloudreader.bean.MovieDetailBean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBean(com.example.jingbin.cloudreader.bean.MovieDetailBean Bean, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.aka) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.summary) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.util.List<java.lang.String> beanAka = null;
        java.lang.String stringFormatUtilFormatGenresBeanAka = null;
        java.lang.String beanSummary = null;
        com.example.jingbin.cloudreader.bean.MovieDetailBean bean = mBean;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (bean != null) {
                        // read bean.aka
                        beanAka = bean.getAka();
                    }


                    // read StringFormatUtil.formatGenres(bean.aka)
                    stringFormatUtilFormatGenresBeanAka = com.example.jingbin.cloudreader.utils.StringFormatUtil.formatGenres(beanAka);
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (bean != null) {
                        // read bean.summary
                        beanSummary = bean.getSummary();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, beanSummary);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOneTitle, stringFormatUtilFormatGenresBeanAka);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityOneMovieDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityOneMovieDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityOneMovieDetailBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityOneMovieDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityOneMovieDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.activity_one_movie_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityOneMovieDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityOneMovieDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_one_movie_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityOneMovieDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bean
        flag 1 (0x2L): bean.aka
        flag 2 (0x3L): bean.summary
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}