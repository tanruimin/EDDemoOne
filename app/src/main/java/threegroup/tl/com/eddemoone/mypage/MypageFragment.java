package threegroup.tl.com.eddemoone.mypage;


import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;
import threegroup.tl.com.eddemoone.mypage.activity.AboutMeActivity;
import threegroup.tl.com.eddemoone.mypage.activity.MyMessageActivity;
import threegroup.tl.com.eddemoone.mypage.activity.SettingActivity;
import threegroup.tl.com.eddemoone.mypage.activity.SiteActivity;

/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class MypageFragment extends MVPBaseFragment<MypageContract.View, MypagePresenter> implements MypageContract.View {
    @BindView(R.id.autolayout_aboutwe)
    AutoRelativeLayout autolayout_aboutwe;
    @BindView(R.id.autolayout_newaddress)
    AutoRelativeLayout autolayout_addess;
    @BindView(R.id.autola_setting)
    AutoRelativeLayout autola_seeting;
    @BindView(R.id.img_lingdang)
    ImageView mImgLingdang;

    @BindView(R.id.autulayout)
    AutoRelativeLayout mAutulayout;
    @BindView(R.id.img_qbu)
    ImageView mImgQbu;
    @BindView(R.id.img_daifahuo)
    ImageView mImgDaifahuo;
    @BindView(R.id.img_daishouhuo)
    ImageView mImgDaishouhuo;
    @BindView(R.id.img_pingjia)
    ImageView mImgPingjia;
    @BindView(R.id.img_shouhou)
    ImageView mImgShouhou;
    @BindView(R.id.img_shoucang)
    ImageView mImgShoucang;
    @BindView(R.id.img_dizhi)
    ImageView mImgDizhi;
    @BindView(R.id.img_setting)
    ImageView mImgSetting;
    @BindView(R.id.img_my)
    ImageView mImgMy;
    @BindView(R.id.img_fenxiang)
    ImageView mImgFenxiang;
    @BindView(R.id.img_dafen)
    ImageView mImgDafen;


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





    @OnClick({R.id.img_lingdang, R.id.circimg, R.id.autulayout,R.id.autola_setting
            ,R.id.autolayout_aboutwe,R.id.autolayout_newaddress})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_lingdang:
                startActivity(new Intent(getActivity(), MyMessageActivity.class));
                break;
            case R.id.circimg:
                break;
            case R.id.autulayout:
                break;
            case R.id.autola_setting:
             startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            case R.id.autolayout_aboutwe:
                startActivity(new Intent(getActivity(),AboutMeActivity.class));
                break;
            case R.id.autolayout_newaddress:
                startActivity(new Intent(getActivity(),SiteActivity.class));
                break;
        }
    }
}
