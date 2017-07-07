package threegroup.tl.com.eddemoone.mypage.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.home.HomeContract;
import threegroup.tl.com.eddemoone.home.HomePresenter;
import threegroup.tl.com.eddemoone.mvp.MVPBaseActivity;

public class AboutMeActivity extends MVPBaseActivity<HomeContract.View, HomePresenter> implements HomeContract.View {
    @BindView(R.id.auturela_aboutme)
    AutoRelativeLayout mAuturelaAboutme;
    @BindView(R.id.img_logo)
    ImageView mImgLogo;
    @BindView(R.id.tv_name_gs)
    TextView mTvNameGs;
    @BindView(R.id.tv_address_http)
    TextView mTvAddressHttp;
    @BindView(R.id.tv_about_shengji)
    TextView mTvAboutShengji;
    @BindView(R.id.autula_about_new)
    AutoRelativeLayout mAutulaAboutNew;

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_about_me;
    }

    @Override
    protected void initViews() {

    }




    @OnClick({R.id.img_logo, R.id.autula_about_new})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_logo:
                startActivity(new Intent(this,QueueActivity.class));
                break;
            case R.id.autula_about_new:
                dialogdata();
                break;
        }
    }
    //dialog显示更新
    private void dialogdata() {
        //点击button跳转页面显示一个dialog，定义他的格式
        final Dialog dialog = new Dialog(this, R.style.Theme_Light_Dialog);
        //显示dialog
        dialog.show();
//                实例化view并指定布局
        LayoutInflater inflater = LayoutInflater.from(this);
        View viewDialog = inflater.inflate(R.layout.adapter_list_dialog, null);
        //           根据view找控件
              Button dialogbut= viewDialog.findViewById(R.id.but_dialog_gengxin);
               dialogbut.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       dialog.dismiss();
                   }
               });
        //定义dialog的宽高
        Display display = this.getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
//设置dialog的宽高为屏幕的宽高
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(width, height);
        dialog.setContentView(viewDialog, layoutParams);
    }

}
