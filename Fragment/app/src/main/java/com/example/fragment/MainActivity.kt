package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub1 = Fragment01()
        val sub2 = Fragment02()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl, sub1)
            commit()
        }

        findViewById<Button>(R.id.btnF01).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl, sub1)
                commit()
            }
        }

        findViewById<Button>(R.id.btnF02).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl, sub2)
                commit()
            }
        }
    }
}