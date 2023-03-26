package com.example.practices_room_database

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var db: UserDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = UserDatabase.getInstance(applicationContext)


        val newUser = User(name = "thinh", email = "thinhlam749@gmail.com")
        db.userDao().insert(newUser)

    }
}