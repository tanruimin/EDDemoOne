package threegroup.tl.com.eddemoone.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * date: 2017/7/5
 * author:侯亮亮候亮亮
 */

public class BannerGlideUtil extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
      //Glide 加载图片简单用法
        Glide.with(context).load(path).into(imageView);
    }


}
