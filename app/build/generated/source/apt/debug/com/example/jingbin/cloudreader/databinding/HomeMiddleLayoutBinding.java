package com.example.jingbin.cloudreader.databinding;
import com.example.jingbin.cloudreader.R;
import com.example.jingbin.cloudreader.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeMiddleLayoutBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.personal_recommend, 1);
        sViewsWithIds.put(R.id.ib_xiandu, 2);
        sViewsWithIds.put(R.id.fl_everyday, 3);
        sViewsWithIds.put(R.id.daily_btn, 4);
        sViewsWithIds.put(R.id.tv_daily_text, 5);
        sViewsWithIds.put(R.id.textView4, 6);
        sViewsWithIds.put(R.id.ib_movie_hot, 7);
    }
    // views
    @NonNull
    public final android.widget.ImageView dailyBtn;
    @NonNull
    public final android.widget.FrameLayout flEveryday;
    @NonNull
    public final android.widget.ImageButton ibMovieHot;
    @NonNull
    public final android.widget.ImageButton ibXiandu;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.LinearLayout personalRecommend;
    @NonNull
    public final android.widget.TextView textView4;
    @NonNull
    public final android.widget.TextView tvDailyText;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeMiddleLayoutBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.dailyBtn = (android.widget.ImageView) bindings[4];
        this.flEveryday = (android.widget.FrameLayout) bindings[3];
        this.ibMovieHot = (android.widget.ImageButton) bindings[7];
        this.ibXiandu = (android.widget.ImageButton) bindings[2];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.personalRecommend = (android.widget.LinearLayout) bindings[1];
        this.textView4 = (android.widget.TextView) bindings[6];
        this.tvDailyText = (android.widget.TextView) bindings[5];
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
    public static HomeMiddleLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeMiddleLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<HomeMiddleLayoutBinding>inflate(inflater, com.example.jingbin.cloudreader.R.layout.home_middle_layout, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static HomeMiddleLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeMiddleLayoutBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.jingbin.cloudreader.R.layout.home_middle_layout, null, false), bindingComponent);
    }
    @NonNull
    public static HomeMiddleLayoutBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static HomeMiddleLayoutBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/home_middle_layout_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new HomeMiddleLayoutBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}