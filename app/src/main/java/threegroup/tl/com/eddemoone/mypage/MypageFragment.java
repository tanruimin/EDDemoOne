package threegroup.tl.com.eddemoone.mypage;


import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MypageFragment extends MVPBaseFragment<MypageContract.View, MypagePresenter> implements MypageContract.View {

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_my_page;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }
}
