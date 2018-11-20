package com.electrodiligent.rewardiligent.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.electrodiligent.rewardiligent.R;
import com.electrodiligent.rewardiligent.model.TodoItem;

import java.util.List;

/**
 * Created by sumit on 23-02-2018.
 */

public class TodoItemAdapter extends ArrayAdapter {
    List<TodoItem> mTodoItems;
    LayoutInflater mInflater;

    public TodoItemAdapter(@NonNull Context context, @NonNull List objects) {

        super(context, R.layout.todo_item, objects);

        mTodoItems = objects;
        mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.todo_item,parent,false);
        }

        TodoItem todoItem = mTodoItems.get(position);

        TextView title = convertView.findViewById(R.id.item_title);
        TextView time =convertView.findViewById(R.id.item_timestamp);

        title.setText(todoItem.getItemTitle());
        if (todoItem.getItemTime() != null)
        time.setText(todoItem.getItemTime());

        return convertView;
    }
}
