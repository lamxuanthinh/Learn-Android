package com.example.practices_sqlite

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.practices_sqlite.databinding.ActivityMain2Binding

private lateinit var binding: ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val helper = MyDbHelper(this)
        var arrayList: ArrayList<OutData> = helper!!.read()


        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        binding.rvDog.adapter = RvAdapter(arrayList)

        binding.rvDog.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.itmEdit -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return (super.onOptionsItemSelected(item))
    }

}