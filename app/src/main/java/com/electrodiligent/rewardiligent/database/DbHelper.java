package com.electrodiligent.rewardiligent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sumit on 02-03-2018.
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String DB_FILE_NAME = "rewarddeligent";
    public static final int DB_VERSION = 1;


    public DbHelper(Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TodoItemTable.SQL_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(TodoItemTable.SQL_DELETE);
        onCreate(sqLiteDatabase);
    }
}
