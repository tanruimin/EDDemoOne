package threegroup.tl.com.eddemoone.merchant;


import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MerchantFragment extends MVPBaseFragment<MerchantContract.View, MerchantPresenter> implements MerchantContract.View {

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_merchant;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
}
