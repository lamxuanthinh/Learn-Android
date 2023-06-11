package com.example.recyclerview

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.Toast
import com.example.recyclerview.databinding.ActivityMainBinding

//@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.film01, "Name Film1", "Description Film1"))
        list.add(OutData(R.drawable.film04, "Name Film2", "Description Film2"))
        list.add(OutData(R.drawable.film06, "Name Film3", "Description Film3"))
        list.add(OutData(R.drawable.film01, "Name Film4", "Description Film4"))
        list.add(OutData(R.drawable.film01, "Name Film4", "Description Film4"))
        list.add(OutData(R.drawable.film01, "Name Film4", "Description Film4"))
        list.add(OutData(R.drawable.film01, "Name Film4", "Description Film4"))
        list.add(OutData(R.drawable.film01, "Name Film4", "Description Film4"))

        binding.rvFilm.adapter = RvAdapter(list, object : RvInterface {
            override fun onClickFilm(position: Int) {
                Toast.makeText(
                    this@MainActivity,
                    "Click ${list[position].nameFilm}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        binding.rvFilm.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

//        binding.rvFilm.layoutManager = LinearLayoutManager(
//            this,
//            LinearLayoutManager.HORIZONTAL,
//            false
//        )

//        binding.rvFilm.layoutManager = GridLayoutManager(
//            this,
//            2,
//            GridLayoutManager.VERTICAL,
//            false
//        )

    }
}