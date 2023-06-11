package com.example.gridview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Toast
import com.example.gridview.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list = mutableListOf<OutData>()

        list.add(OutData(R.drawable.film01, "Film 01"))
        list.add(OutData(R.drawable.film04, "Film 01"))
        list.add(OutData(R.drawable.film05, "Film 01"))
        list.add(OutData(R.drawable.film06, "Film 01"))
        list.add(OutData(R.drawable.film01, "Film 01"))
        list.add(OutData(R.drawable.film04, "Film 01"))
        list.add(OutData(R.drawable.film05, "Film 01"))
        list.add(OutData(R.drawable.film06, "Film 01"))
        list.add(OutData(R.drawable.film01, "Film 01"))
        list.add(OutData(R.drawable.film04, "Film 01"))
        list.add(OutData(R.drawable.film05, "Film 01"))
        list.add(OutData(R.drawable.film06, "Film 01"))

        binding.gvFilm.adapter = CustomGridView(this, list);

        binding.gvFilm.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, list[position].nameFilm, Toast.LENGTH_LONG).show()
        }
    }
}