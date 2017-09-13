package com.crux.inductionsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo on 9/13/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "imagetable.db";
    public static  final String TABLE_NAME = "IMAGETABLE";
    public static final String COLUMN_ONE = "SRNO";
    public static final String COLUMN_TWO = "URLS";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
