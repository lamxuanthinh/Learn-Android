package com.example.practices_sqlite


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context: Context) : SQLiteOpenHelper(context, "USER", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE DOG(user_id INTEGER PRIMARY KEY AUTOINCREMENT,image TEXT, name TEXT ) ")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun addNewDog(image: String, name: String) {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put("image", image)
            put("name", name)
        }
        db?.insert("DOG", null, values)
    }

    fun readDog(): ArrayList<OutData> {
        val db = readableDatabase
        val rs = db.rawQuery("SELECT * FROM DOG", null)
        val arrayList = ArrayList<OutData>()
        if (rs.moveToFirst()) {
            do {
                arrayList.add(
                    OutData(
                        rs.getString(1), rs.getString(2)
                    )
                )
            } while (rs.moveToNext())
            rs.close()
        }
        return arrayList
    }


    fun delete(name: String) {
        val db = this.writableDatabase
        db?.delete("DOG", "name=?", arrayOf(name))
    }

    fun update(originalName: String, image: String?, name: String?) {
        val db = this.writableDatabase
        val values = ContentValues().apply {
            put("image", image)
            put("name", name)
        }

        db?.update("DOG", values ,"name=?", arrayOf(originalName))

    }
}