package com.example.lesson01

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.lesson01.databinding.ActivityCreateUiForLoginBinding


private lateinit var binding: ActivityCreateUiForLoginBinding

class Create_UI_for_Login_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateUiForLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val helper = MyDbHelper(applicationContext)
        val db = helper.readableDatabase

        binding.btnLogin.setOnClickListener {
            var values = ContentValues().apply {
                put("name", binding.edtUserName.text.toString())
                put("password", binding.edtPassword.text.toString())
            }
            db?.insert("USER", null, values)
            Toast.makeText(this, "Completed Insert", Toast.LENGTH_LONG).show()
            binding.edtUserName.setText("")
            binding.edtPassword.setText("")
        }
    }

}