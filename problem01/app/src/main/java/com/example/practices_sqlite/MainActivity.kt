package com.example.practices_sqlite

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.practices_sqlite.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val helper = MyDbHelper(this)

        // button add courses
        binding.btnAdd.setOnClickListener {
            val name =  binding.edtName.text.toString()
            val phone =  binding.edtPhone.text.toString()
            val email =  binding.edtEmail.text.toString()

            helper.add(name, phone, email)

            binding.edtPhone.setText("")
            binding.edtName.setText("")
            binding.edtEmail.setText("")

            Toast.makeText(this, "Completed Insert", Toast.LENGTH_LONG).show()
        }

        // button view all
        binding.btnViewAll.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }


}