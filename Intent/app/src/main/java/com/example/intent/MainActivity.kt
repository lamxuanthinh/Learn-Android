package com.example.intent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.intent.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoToScreen02.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", "JocelynLam")
            startActivity(intent)
        }

        binding.btnGoToGlobal.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://lamxuanthinh.tk"))
            startActivity(intent)
        }
    }
}