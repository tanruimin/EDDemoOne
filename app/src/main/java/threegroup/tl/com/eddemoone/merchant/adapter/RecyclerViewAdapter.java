package threegroup.tl.com.eddemoone.merchant.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import threegroup.tl.com.eddemoone.R;
import threegroup.tl.com.eddemoone.merchant.bean.GsonBean;


/**
 * date:2017/7/5.
 * author:刘宏亮.
 * function:
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<GsonBean> mList=new ArrayList();

    public RecyclerViewAdapter(Context context, List<GsonBean> list) {
        this.context = context;
        mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=null;
        RecyclerView.ViewHolder viewHolder=null;
        switch (viewType){
            case 0:
                view= LayoutInflater.from(context).inflate(R.layout.merchant_line,parent,false);
                viewHolder=new ViewHolder1(view);
                break;
            case 1:
                view= LayoutInflater.from(context).inflate(R.layout.list_item2,parent,false);
                viewHolder=new ViewHolder2(view);
                break;
        }
        return viewHolder;
    }
    public int getItemViewType(int position) {
        if (position %2==0){
            return 0;
        }
        if (position %2==1){
            return 1;
        }
        return -1;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        switch (itemViewType) {
            case 0:
                final ViewHolder1 vh = (ViewHolder1) holder;
                break;
            case 1:
                final ViewHolder2 vh2 = (ViewHolder2) holder;
                GridAdapter adapter = new GridAdapter();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
                gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
                vh2.mRecyclerView.setLayoutManager(gridLayoutManager);
                vh2.mRecyclerView.setAdapter(adapter);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 18;
    }
    class ViewHolder1 extends RecyclerView.ViewHolder{


        private final TextView mMerchant_line_name;

        public ViewHolder1(View itemView) {
            super(itemView);
            mMerchant_line_name = itemView.findViewById(R.id.merchant_line_name);
            AutoUtils.autoSize(itemView);
        }


    }
    class ViewHolder2 extends RecyclerView.ViewHolder{


        private final RecyclerView mRecyclerView;

        public ViewHolder2(View itemView) {
            super(itemView);
            mRecyclerView = itemView.findViewById(R.id.item_rvcontent);
            AutoUtils.autoSize(itemView);
        }

    }
    class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder>{
        @Override
        public GridAdapter.GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(context, R.layout.list_item_item, null);
            return new GridViewHolder(view);
        }

        @Override
        public void onBindViewHolder(GridAdapter.GridViewHolder holder, int position) {
            GsonBean gsonBean = mList.get(position);
            holder.setData(gsonBean);

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        public class GridViewHolder extends RecyclerView.ViewHolder {

            private final ImageView mIv_logo;
            private final TextView mTv_name;

            public GridViewHolder(View itemView) {
                super(itemView);
                mIv_logo = itemView.findViewById(R.id.item_item_imageview);
                mTv_name = itemView.findViewById(R.id.item_tiem_textview);
                AutoUtils.autoSize(itemView);
            }

            public void setData(GsonBean x) {
                mIv_logo.setImageResource(x.getImg());
                mTv_name.setText(x.getName());

            }
        }
    }


}
