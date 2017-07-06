package threegroup.tl.com.eddemoone.merchant.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * date:2017/7/5.
 * author:刘宏亮.
 * function:
 */

public class BrandTextView extends android.support.v7.widget.AppCompatTextView {
    public BrandTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    public BrandTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public BrandTextView(Context context) {
        super(context);
    }
    public void setTypeface(Typeface tf, int style) {
        if (style == Typeface.BOLD) {
            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "microsoftyahei/msyhbd.ttf"));
        } else {
            super.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "microsoftyahei/msyh.ttf"));
        }
    }
}
