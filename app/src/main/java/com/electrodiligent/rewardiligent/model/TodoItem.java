package com.electrodiligent.rewardiligent.model;

import android.content.ContentValues;

import com.electrodiligent.rewardiligent.database.TodoItemTable;

import java.sql.Time;
import java.util.UUID;

/**
 * Created by sumit on 23-02-2018.
 */

public class TodoItem {
    private String itemID;
    private  String itemTitle;
    private  String itemDescription;
    private String itemTime;


    public TodoItem() {
    }

    public TodoItem(String itemID, String itemTitle, String itemDescription, String itemTime) {
        if (itemID == null){
            itemID = UUID.randomUUID().toString();
        }

        this.itemID = itemID;
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
        this.itemTime = itemTime;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemTime() {
        return itemTime;
    }

    public void setItemTime(String itemTime) {
        this.itemTime = itemTime;
    }



    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues();
        contentValues.put(TodoItemTable.COLUMN_ID,itemID);
        contentValues.put(TodoItemTable.COLUMN_NAME,itemTitle);
        return contentValues;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "itemID=" + itemID +
                ", itemTitle='" + itemTitle + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemTime='" + itemTime + '\'' +
                '}';
    }
}
