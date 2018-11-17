package com.electrodiligent.rewardiligent.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.electrodiligent.rewardiligent.R;
import com.electrodiligent.rewardiligent.model.RewardItem;

import java.util.List;

public class RewardItemAdapter extends RecyclerView.Adapter<RewardItemAdapter.ViewHolder> implements View.OnClickListener {

    private List<RewardItem> mItems;
    private Context mContext;

    public RewardItemAdapter(Context context, List<RewardItem> items) {
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public RewardItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.reward_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RewardItemAdapter.ViewHolder holder, int position) {
        final RewardItem item = mItems.get(position);

        holder.tvTitle.setText(item.getRewardTitle());
        holder.tvProgress.setText(item.getRewardTaskProgressString());
        holder.tvTaskDate.setText(item.getRewardTaskInitDate());
        holder.pbProgress.setProgress(item.getRewardTaskProgress());
        holder.optMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(mContext,"Options for "+ item.getRewardTitle(),Toast.LENGTH_SHORT).show();
            }

        });

//            String imageFile = item.getImage();
//            InputStream inputStream = mContext.getAssets().open(imageFile);
//            Drawable d = Drawable.createFromStream(inputStream, null);
//            holder.imageView.setImageDrawable(d);

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
//            case R.id.reward_item_option_btn_image :
//
//                Toast.makeText(mContext,"Option button clicked for"+item,Toast.LENGTH_LONG).show();
//
//                break;
                default:
                    return;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvProgress;
        public TextView tvTaskDate;
        public ProgressBar pbProgress;
        public ImageView optMenu;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.reward_item_title);
            tvProgress = itemView.findViewById(R.id.reward_item_progress_textview);
            tvTaskDate = itemView.findViewById(R.id.reward_item_task_date_textview);
            pbProgress = itemView.findViewById(R.id.reward_item_progressbar);
            optMenu = itemView.findViewById(R.id.reward_item_option_btn_image);

            // imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}