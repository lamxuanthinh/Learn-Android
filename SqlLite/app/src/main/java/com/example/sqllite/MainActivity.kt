package com.example.sqllite

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helper = MyDbHelper(applicationContext)
        val db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM USER", null)

        if (rs.moveToLast()) {
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_SHORT).show()
        }
    }
}