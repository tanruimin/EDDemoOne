package threegroup.tl.com.eddemoone.mypage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.home.HomeContract;
import threegroup.tl.com.eddemoone.home.HomePresenter;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;

public class NewaddressActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {


    @BindView(R.id.auutu_newaddress)
    AutoRelativeLayout mAuutuNewaddress;
    @BindView(R.id.tv_newaddress_diqu)
    TextView mTvNewaddressDiqu;
    @BindView(R.id.autulayou_xinzdizhi)
    AutoLinearLayout mAutulayouXinzdizhi;
    @BindView(R.id.but_shouhuo_refer)
    Button mButShouhuoRefer;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_newaddress;
    }

    @Override
    protected void initViews() {

    }


    @OnClick({R.id.tv_newaddress_diqu, R.id.but_shouhuo_refer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_newaddress_diqu:
                break;
            case R.id.but_shouhuo_refer:
                   Toast.makeText(NewaddressActivity.this,"点击我了",Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this,AboutMeActivity.class));
                break;
        }
    }
}
