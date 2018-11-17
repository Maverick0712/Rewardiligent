package com.electrodiligent.rewardiligent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.electrodiligent.rewardiligent.adapters.TodoItemAdapter;
import com.electrodiligent.rewardiligent.model.TodoItem;
import com.electrodiligent.rewardiligent.sampledata.SampleDataProvider;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 17-02-2018.
 */

public class TodoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.todo_fragment, container, false);

       List<TodoItem> todoItemList = SampleDataProvider.todoItemList;

//        List<String> myList = new ArrayList<>();
//
//        for (TodoItem item:
//             todoItemList) {
//            myList.add(item.getItemTitle());
//
//        }

        ListView listView = (ListView) view.findViewById(R.id.priority_task_list);

       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,myList);

       // listView.setAdapter(arrayAdapter);

        TodoItemAdapter todoItemAdapter = new TodoItemAdapter(this.getActivity(),todoItemList);
        listView.setAdapter(todoItemAdapter);

        return view;

    }
}


