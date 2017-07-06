package threegroup.tl.com.eddemoone.mypage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.home.HomeContract;
import threegroup.tl.com.eddemoone.home.HomePresenter;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;

public class MyMessageActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {


    @BindView(R.id.tv_mymessa_tou)
    TextView mTvMymessaTou;
    @BindView(R.id.tv_mymessa_nic)
    TextView mTvMymessaNic;
    @BindView(R.id.img_mymess_title)
    ImageView mImgMymessTitle;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_my_message;
    }

    @Override
    protected void initViews() {

    }

    @OnClick({R.id.tv_mymessa_nic, R.id.img_mymess_title})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_mymessa_nic:
                break;
            case R.id.img_mymess_title:
                startActivity(new Intent(this,SiteActivity.class));
                break;
        }
    }
}
