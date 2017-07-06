package threegroup.tl.com.eddemoone.myhome;

import android.content.Context;

import java.util.ArrayList;

import threegroup.tl.com.eddemoone.mvp.BasePresenterImpl;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MyhomePresenter extends BasePresenterImpl<MyhomeContract.View> implements MyhomeContract.Presenter{

    @Override
    public void getData(Context content) {
        ArrayList<String> imageViews = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            imageViews.add("http://img0.imgtn.bdimg.com/it/u=1360614014,3610785079&fm=214&gp=0.jpg");
        }
        mView.loadData(imageViews);
    
    }
}
