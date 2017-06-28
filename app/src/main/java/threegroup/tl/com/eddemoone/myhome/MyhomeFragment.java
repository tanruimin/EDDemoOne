package threegroup.tl.com.eddemoone.myhome;


import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MyhomeFragment extends MVPBaseFragment<MyhomeContract.View, MyhomePresenter> implements MyhomeContract.View {

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_myhome;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
}
