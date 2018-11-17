package com.electrodiligent.rewardiligent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.electrodiligent.rewardiligent.helper.Helper;

/**
 * Created by sumit on 04-02-2018.
 */

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.home_fragment, container, false);

               TextView t = view.findViewById(R.id.current_age_value_text);
               t.setText(Helper.yourCurrentAge());
        return view;
    }



}



