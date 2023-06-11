package com.example.practices_sqlite


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context) : SQLiteOpenHelper(context, "USER", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE ContactInfor (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT, phone TEXT, email TEXT ) ")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun add(name: String, phone: String, email: String) {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put("name", name)
            put("phone", phone)
            put("email", email)
        }
        db?.insert("ContactInfor", null, values)
    }

    fun read(): ArrayList<OutData> {
        val db = this.readableDatabase
        val rs = db.rawQuery("SELECT * FROM ContactInfor", null)
        val arrayList = ArrayList<OutData>()
        if (rs.moveToFirst()) {
            do {
                arrayList.add(
                    OutData(
                        rs.getString(1), rs.getString(2), rs.getString(3)
                    )
                )
            } while (rs.moveToNext())
            rs.close()
        }
        return arrayList
    }
}