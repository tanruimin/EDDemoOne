package threegroup.tl.com.eddemoone.mypage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.home.HomeContract;
import threegroup.tl.com.eddemoone.home.HomePresenter;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;

public class SettingActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {
    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initViews() {

    }
}
