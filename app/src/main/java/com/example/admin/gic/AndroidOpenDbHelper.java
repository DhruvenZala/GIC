package com.example.admin.gic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
 
public class AndroidOpenDbHelper extends SQLiteOpenHelper {
	// Database name and version
	public static final String DB_NAME = "GTUdata";
	public static final int DB_VERSION = 1;
	
	// Table name and columns
	public static final String TABLE_NAME_GPA = "userdata";
	public static final String COLUMN_NAME_UNDERGRADUATE_NAME = "username";
	public static final String COLUMN_NAME_UNDERGRADUATE_UNI_ID = "password";
	public static String username;
	public static String password;
	public static String userdata;


	public AndroidOpenDbHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sqlQuery = "create table if not exists " + TABLE_NAME_GPA + " ( " + BaseColumns._ID + " integer primary key autoincrement, " 
																+ COLUMN_NAME_UNDERGRADUATE_NAME + " text not null, "
																+ COLUMN_NAME_UNDERGRADUATE_UNI_ID + " text not null);";
		db.execSQL(sqlQuery);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		if(oldVersion == 1 && newVersion == 2){
                
        }
	}
}