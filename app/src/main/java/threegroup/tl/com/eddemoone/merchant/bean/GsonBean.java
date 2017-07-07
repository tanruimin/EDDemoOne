package threegroup.tl.com.eddemoone.merchant.bean;
/**
 * date:2017/5/23.
 * author:刘宏亮.
 * function:
 */

public class GsonBean {
    private String name;
    private int img;

    public GsonBean(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

