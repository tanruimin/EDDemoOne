package threegroup.tl.com.eddemoone.myhome;

import android.content.Context;

import java.util.List;

import threegroup.tl.com.eddemoone.mvp.BasePresenter;
import threegroup.tl.com.eddemoone.mvp.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class MyhomeContract {
    interface View extends BaseView {
        /**
         * 显示数据
         * @param dataList 数据
         */
        void loadData(List dataList);
    }

    interface  Presenter extends BasePresenter<View> {
        /**
         * 加载数据
         */
        void getData(Context content);
    }
}
