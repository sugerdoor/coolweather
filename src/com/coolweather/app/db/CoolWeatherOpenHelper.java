package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
		
	/*
	 *province 建表语句
	 * */
	public static final String CREATE_PROVINCE = "create table province("
			+ "id integer primary key autoincrement," + "province_name text,"
			+ "province_code text)";
	/*
	*city 建表语句
	* */
	public static final String CREATY_CITY = "create table city("
			+ "id integer primary key autoincrement," + "city_name text,"
			+ "city_code text," + "province_id integer)";
	/*
	 *country 建表语句
	 * */
	public static final String CREATY_COUNTRY = "create table country("
			+ "id integer primary key autoincrement," + "country_name text,"
			+ "country_code text," + "city_id integer)";

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATY_CITY);
		db.execSQL(CREATY_COUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
