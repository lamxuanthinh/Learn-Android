package com.example.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var txtShow: TextView
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtShow = findViewById(R.id.txtShow)
        btnBack = findViewById(R.id.btnBack)

        if(intent != null) {
            val data = intent.getStringExtra("MESSAGE")
            txtShow.text = "HELLO $data"
        }

        btnBack.setOnClickListener {
            var intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
        }

    }
}