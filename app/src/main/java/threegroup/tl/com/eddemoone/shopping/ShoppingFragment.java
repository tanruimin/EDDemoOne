package threegroup.tl.com.eddemoone.shopping;


import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class ShoppingFragment extends MVPBaseFragment<ShoppingContract.View, ShoppingPresenter> implements ShoppingContract.View {

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_shopping;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
}
