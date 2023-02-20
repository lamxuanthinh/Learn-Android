package com.example.intent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtYourName: TextView
    lateinit var btnClickMe: Button
    lateinit var btnDial: Button
    lateinit var btnUrl: Button
    lateinit var txtUrl: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtYourName = findViewById(R.id.txtYourName)
        btnClickMe = findViewById(R.id.btnClickMe)
        btnDial = findViewById(R.id.btnDial)
        btnUrl = findViewById(R.id.btnUrl)
        txtUrl = findViewById(R.id.txtUrl)

        btnClickMe.setOnClickListener {
            val intent =  Intent(this, MainActivity2::class.java)
            val name = txtYourName.text.toString()
            intent.putExtra("MESSAGE", name)
            startActivity(intent)
        }

        btnDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }

        btnUrl.setOnClickListener {
            var url = txtUrl.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}