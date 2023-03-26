package com.example.lesson01

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class MyDbHelper(context: Context) : SQLiteOpenHelper(context, "USER", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE USER(user_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT, password TEXT ) ")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}