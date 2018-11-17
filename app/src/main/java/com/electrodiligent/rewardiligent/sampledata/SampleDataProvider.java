package com.electrodiligent.rewardiligent.sampledata;

import com.electrodiligent.rewardiligent.model.RewardItem;
import com.electrodiligent.rewardiligent.model.TodoItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sumit on 23-02-2018.
 */

public class SampleDataProvider {

    public static List<TodoItem> todoItemList;
    public static Map<String, TodoItem> todoItemMap;

    public static List<RewardItem> rewardItemList;
    public static Map<String, RewardItem> rewardItemMap;

    static {
        todoItemList = new ArrayList<>();
        todoItemMap = new HashMap<>();
        addTodoItem( new TodoItem("1","First todo1", "none", "00:54 AM"));
        addTodoItem( new TodoItem("2","First todo2", "none", "00:54 AM"));
        addTodoItem( new TodoItem("3","First todo3", "none", "00:54 AM"));
        addTodoItem( new TodoItem("4","First todo4", "none", "00:54 AM"));
        addTodoItem( new TodoItem("5","First todo5", "none", "00:54 AM"));
        addTodoItem( new TodoItem("6","First todo6", "none", "00:54 AM"));
        addTodoItem( new TodoItem("7","First todo7", "none", "00:54 AM"));
        addTodoItem( new TodoItem("8","First todo8", "none", "00:54 AM"));
        addTodoItem( new TodoItem("9","First todo9", "none", "00:54 AM"));
        addTodoItem( new TodoItem("10","First todo10", "none", "00:54 AM"));
        addTodoItem( new TodoItem("11","First todo11", "none", "00:54 AM"));
        addTodoItem( new TodoItem("12","First todo12", "none", "00:54 AM"));
        addTodoItem( new TodoItem("13","First todo13", "none", "00:54 AM"));
        addTodoItem( new TodoItem("14","First todo14", "none", "00:54 AM"));
        addTodoItem( new TodoItem("15","First todo15", "none", "00:54 AM"));
        addTodoItem( new TodoItem("16","First todo16", "none", "00:54 AM"));
        addTodoItem( new TodoItem("17","First todo17", "none", "00:54 AM"));
        addTodoItem( new TodoItem("18","First todo18", "none", "00:54 AM"));
        addTodoItem( new TodoItem("19","First todo19", "none", "00:54 AM"));



        rewardItemList = new ArrayList<>();
        rewardItemMap = new HashMap<>();
        addRewardItem(new RewardItem("1","Cycling shoes","14 Jan 2018",34));
        addRewardItem(new RewardItem("2","Cycling T-shirt","01 Jan 2018",14));
        addRewardItem(new RewardItem("3","New helmet ","14 Dec 2017",98));
        addRewardItem(new RewardItem("4","Maverick Sticker","04 Jan 2017",74));
        addRewardItem(new RewardItem("5","Exercise mat","11 Feb 2018",60));


    }

    private static void addTodoItem(TodoItem todoItem){
        todoItemList.add(todoItem);
        todoItemMap.put(todoItem.getItemID(),todoItem);
    }

    private static void addRewardItem(RewardItem rewardItem){
        rewardItemList.add(rewardItem);
        rewardItemMap.put(rewardItem.getRewardID(),rewardItem);
    }

}
