package threegroup.tl.com.eddemoone.myhome;


import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.List;

import butterknife.BindView;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;
import threegroup.tl.com.eddemoone.utils.BannerGlideUtil;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MyhomeFragment extends MVPBaseFragment<MyhomeContract.View, MyhomePresenter> implements MyhomeContract.View {
    @BindView(R.id.banner_myhome)
    Banner mBannerMyhome;
    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_myhome;
    }

    @Override
    protected void initViews() {
        //调用p层接口
        mPresenter.getData(getActivity());
    }

    @Override
    protected void updateViews(boolean isRefresh) {

    }

    @Override
    public void loadData(List dataList) {
        //测试数据
        mBannerMyhome.setImageLoader(new BannerGlideUtil());
        mBannerMyhome.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        mBannerMyhome.setIndicatorGravity(BannerConfig.RIGHT);
        mBannerMyhome.setImages(dataList);
        mBannerMyhome.start();
    }
}
