package com.electrodiligent.rewardiligent;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.electrodiligent.rewardiligent.adapters.RewardItemAdapter;
import com.electrodiligent.rewardiligent.adapters.RewardItemListViewAdapter;
import com.electrodiligent.rewardiligent.model.RewardItem;
import com.electrodiligent.rewardiligent.sampledata.SampleDataProvider;

import java.util.List;

/**
 * Created by sumit on 08-02-2018.
 */

public class RewardsFragment extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.rewards_fragment, container, false);

        List<RewardItem> rewardItemList = SampleDataProvider.rewardItemList;

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.reward_list);

        RewardItemAdapter rewardItemAdapter = new RewardItemAdapter(getActivity(),rewardItemList);

        recyclerView.setAdapter(rewardItemAdapter);


        return view;


    }
}
