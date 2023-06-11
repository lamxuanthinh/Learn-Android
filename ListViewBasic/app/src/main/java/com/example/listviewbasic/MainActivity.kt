package com.example.listviewbasic

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listviewbasic.databinding.ActivityMainBinding


@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var list: MutableList<String> = mutableListOf("Viet Nam", "Korea")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addEvents()

//        val greenColor = Color.parseColor("#99FFFF")
//        binding.lvCountry.setBackgroundColor(greenColor)


    }

    private fun addEvents() {
        displayCountry()

    }

    private fun displayCountry() {
//        var arrCountry = resources.getStringArray(R.array.arrCountry)
//
//        binding.lvCountry.adapter = ArrayAdapter(
//            this, android.R.layout.simple_list_item_1, arrCountry
//        )
//
//        binding.lvCountry.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, "choose:" + arrCountry[i], Toast.LENGTH_LONG).show()
//        }

        binding.btnSave.setOnClickListener {
            val edtCountry = binding.edtCountry.text.toString()
            list.add(edtCountry)
            binding.edtCountry.setText("")
            binding.edtCountry.requestFocus()
        }

        binding.lvCountry.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            list
        )



    }
}