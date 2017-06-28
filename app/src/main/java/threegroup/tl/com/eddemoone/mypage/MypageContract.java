package threegroup.tl.com.eddemoone.mypage;

import android.content.Context;

import threegroup.tl.com.eddemoone.mvp.BasePresenter;
import threegroup.tl.com.eddemoone.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MypageContract {
    interface View extends BaseView {
        
    }

    interface  Presenter extends BasePresenter<View> {
        
    }
}
