package com.example.foodorderingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="foodorder.db";
    public static final String TABLE_NAME="foodorder_customer";
    public static final String USER_NAME="username";
    public static final String PASSWORD="password";

    public MyDataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"("+USER_NAME+" varchar(200),"+PASSWORD+" varchar(200));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }
    public boolean InsertData(String username,String password)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(USER_NAME,username);
        contentValues.put(PASSWORD,password);
        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)return false;
        else return true;
    }
    public boolean checkusername(String username)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select*from "+TABLE_NAME+" where username=?",new String[]{username});
        if(cursor.getCount()>0)
            return true;
        else return false;
    }
    public boolean checkusenamepassword(String username,String password)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select*from "+TABLE_NAME+" where username=?and password=?",new String[]{username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
