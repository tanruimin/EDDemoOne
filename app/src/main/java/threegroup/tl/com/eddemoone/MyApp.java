package threegroup.tl.com.eddemoone;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * 类描述：
 * data:2017/6/27
 * author:高伟振(lenovo)
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
