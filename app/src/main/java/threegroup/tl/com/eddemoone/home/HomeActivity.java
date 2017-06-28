package threegroup.tl.com.eddemoone.home;


import android.os.Bundle;
import android.system.ErrnoException;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zhy.autolayout.AutoFrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.merchant.MerchantFragment;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;
import threegroup.tl.com.eddemoone.myhome.MyhomeFragment;
import threegroup.tl.com.eddemoone.mypage.MypageFragment;
import threegroup.tl.com.eddemoone.shopping.ShoppingFragment;

/**
*日期:2017/6/28
 * 时间:14:14
 * 作者：高伟振
*类描述：主页面显示四个fragment切换页面
*/

public class HomeActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {

    @BindView(R.id.framlayout)
    AutoFrameLayout mFramlayout;
    @BindView(R.id.rb_home)
    RadioButton mRbHome;
    @BindView(R.id.rb_merchant)
    RadioButton mRbMerchant;
    @BindView(R.id.rb_cat)
    RadioButton mRbCat;
    @BindView(R.id.rb_mypage)
    RadioButton mRbMypage;
    @BindView(R.id.autoLinearLayout)
    RadioGroup mAutoLinearLayout;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        addFragment(R.id.framlayout, new MyhomeFragment(), "f1");
    }
    @OnClick({R.id.rb_home, R.id.rb_merchant, R.id.rb_cat, R.id.rb_mypage})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_home:
                replaceFragment(R.id.framlayout, new MyhomeFragment(), "f1");
                break;
            case R.id.rb_merchant:
                replaceFragment(R.id.framlayout,new MerchantFragment(),"f2");
                break;
            case R.id.rb_cat:
                    replaceFragment(R.id.framlayout,new ShoppingFragment(),"f3");
                break;
            case R.id.rb_mypage:
                replaceFragment(R.id.framlayout,new MypageFragment(),"f4");
                break;
        }
    }
}
