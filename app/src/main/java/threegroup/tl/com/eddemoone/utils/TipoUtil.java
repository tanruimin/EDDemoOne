package threegroup.tl.com.eddemoone.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
*作者:侯亮亮
*时间:2017/7/5 20:12
*类描述:改变字体工具类
*/

public class TipoUtil {

    public  static Typeface Tipo(Context context, String type){
        return  Typeface.createFromAsset(context.getAssets(), "fonts/"+type);

    }
}
