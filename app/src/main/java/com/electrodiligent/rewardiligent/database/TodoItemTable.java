package com.electrodiligent.rewardiligent.database;

/**
 * Created by sumit on 02-03-2018.
 */

public class TodoItemTable {

    public static final String TABLE_TODOS = "toDoitems";
    public static final String COLUMN_ID = "toDoId";
    public static final String COLUMN_NAME = "toDoName";
    //        public static final String COLUMN_DESCRIPTION = "description";
//        public static final String COLUMN_CATEGORY = "category";
//        public static final String COLUMN_POSITION = "sortPosition";
//        public static final String COLUMN_PRICE = "price";
//        public static final String COLUMN_IMAGE = "image";
    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_TODOS + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_NAME + " TEXT" + ");";

    public static final String[] ALL_COLUMNS = {COLUMN_ID, COLUMN_NAME};


    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_TODOS;


}
