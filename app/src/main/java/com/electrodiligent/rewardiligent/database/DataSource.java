package com.electrodiligent.rewardiligent.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.electrodiligent.rewardiligent.model.TodoItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 02-03-2018.
 */

public class DataSource {
    private Context mContext;
    SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;


    public DataSource(Context context) {
        this.mContext = context;
        mDbHelper =new DbHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open(){
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close() {
        mDbHelper.close();
    }

    public TodoItem createToDoItem(TodoItem item){
        ContentValues contentValues = item.toValues();
        mDatabase.insert(TodoItemTable.TABLE_TODOS,null,contentValues);
        return item;

    }

    public long getToDoItemCount(){
        return DatabaseUtils.queryNumEntries(mDatabase,TodoItemTable.TABLE_TODOS);
    }

    public List<TodoItem> getAllTodoItems(){
        List<TodoItem> todoItems = new  ArrayList<>();

      Cursor cursor = mDatabase.query(TodoItemTable.TABLE_TODOS, TodoItemTable.ALL_COLUMNS,null,null,null,null,null);

        while (cursor.moveToNext()) {
            TodoItem item = new TodoItem();
            item.setItemID(cursor.getString(cursor.getColumnIndex(TodoItemTable.COLUMN_ID)));
            item.setItemTitle(cursor.getString(cursor.getColumnIndex(TodoItemTable.COLUMN_NAME)));

            todoItems.add(item);

        }

        cursor.close();

        return todoItems;
    }

}
