package com.electrodiligent.rewardiligent.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.electrodiligent.rewardiligent.R;
import com.electrodiligent.rewardiligent.model.RewardItem;

import java.util.List;

/**
 * Created by sumit on 24-02-2018.
 */

public class RewardItemListViewAdapter extends ArrayAdapter {
    List<RewardItem> mRewardItems;
    LayoutInflater mInflater;

    public RewardItemListViewAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, R.layout.reward_item, objects);

        mRewardItems = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.reward_item,parent,false);
        }

        RewardItem rewardItem = mRewardItems.get(position);

        TextView tv = convertView.findViewById(R.id.reward_item_title);
        tv.setText(rewardItem.getRewardTitle());

        tv = convertView.findViewById(R.id.reward_item_progress_textview);
        tv.setText(rewardItem.getRewardTaskProgressString());

        tv = convertView.findViewById(R.id.reward_item_task_date_textview);
        tv.setText(rewardItem.getRewardTaskInitDate());

        ProgressBar pb = convertView.findViewById(R.id.reward_item_progressbar);
        pb.setProgress(rewardItem.getRewardTaskProgress());

        return convertView;
    }
}
