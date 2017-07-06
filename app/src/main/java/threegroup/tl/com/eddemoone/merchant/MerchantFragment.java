package threegroup.tl.com.eddemoone.merchant;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.merchant.adapter.RecyclerViewAdapter;
import threegroup.tl.com.eddemoone.merchant.bean.GsonBean;
import threegroup.tl.com.eddemoone.merchant.widget.SearchView;
import threegroup.tl.com.eddemoone.mvp.MVPBaseFragment;

/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class MerchantFragment extends MVPBaseFragment<MerchantContract.View, MerchantPresenter> implements MerchantContract.View {

    @BindView(R.id.merchant_edt_input)
    SearchView mMerchantEdtInput;
    @BindView(R.id.merchant_btn_join)
    Button mMerchantBtnJoin;
    @BindView(R.id.merchant_lin_smoke)
    AutoLinearLayout mMerchantLinSmoke;
    @BindView(R.id.merchant_lin_tea)
    AutoLinearLayout mMerchantLinTea;
    @BindView(R.id.merchant_lin_bear)
    AutoLinearLayout mMerchantLinBear;
    @BindView(R.id.merchant_lin_zhubao)
    AutoLinearLayout mMerchantLinZhubao;
    @BindView(R.id.merchant_lin_tea2)
    AutoLinearLayout mMerchantLinTea2;
    @BindView(R.id.merchant_lin_tea3)
    AutoLinearLayout mMerchantLinTea3;
    @BindView(R.id.maerchant_recyclerview)
    RecyclerView mMaerchantRecyclerview;
    Unbinder unbinder;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<GsonBean> list=new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            list.add(new GsonBean("百草味",R.drawable.baicaowei));
        }
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(getActivity(),list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mMaerchantRecyclerview.setLayoutManager(linearLayoutManager);
        mMaerchantRecyclerview.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.merchant_edt_input, R.id.merchant_btn_join, R.id.merchant_lin_smoke, R.id.merchant_lin_tea, R.id.merchant_lin_bear, R.id.merchant_lin_zhubao, R.id.merchant_lin_tea2, R.id.merchant_lin_tea3, R.id.maerchant_recyclerview})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.merchant_edt_input:
                break;
            case R.id.merchant_btn_join:
                break;
            case R.id.merchant_lin_smoke:
                break;
            case R.id.merchant_lin_tea:
                break;
            case R.id.merchant_lin_bear:
                break;
            case R.id.merchant_lin_zhubao:
                break;
            case R.id.merchant_lin_tea2:
                break;
            case R.id.merchant_lin_tea3:
                break;
            case R.id.maerchant_recyclerview:
                break;
        }
    }
}
