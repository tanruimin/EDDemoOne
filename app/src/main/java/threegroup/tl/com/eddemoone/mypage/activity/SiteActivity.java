package threegroup.tl.com.eddemoone.mypage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.home.HomeContract;
import threegroup.tl.com.eddemoone.home.HomePresenter;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;

public class SiteActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {
    @BindView(R.id.recyclerview_dizhi)
    RecyclerView mRecyclerviewDizhi;
    @BindView(R.id.but_xinzheng)
    Button mButXinzheng;
    @BindView(R.id.autulayout_shdizhi)
    AutoRelativeLayout mAutulayoutShdizhi;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_site;
    }

    @Override
    protected void initViews() {

    }


    @OnClick({R.id.recyclerview_dizhi, R.id.but_xinzheng})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.recyclerview_dizhi:
                break;
            case R.id.but_xinzheng:
          startActivity(new Intent(this,NewaddressActivity.class));

                break;
        }
    }
}
