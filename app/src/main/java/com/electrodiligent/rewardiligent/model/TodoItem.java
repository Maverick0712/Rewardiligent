package com.electrodiligent.rewardiligent.model;

import java.sql.Time;

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
