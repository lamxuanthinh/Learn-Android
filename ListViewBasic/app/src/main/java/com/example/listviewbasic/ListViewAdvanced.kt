package com.example.listviewbasic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewbasic.databinding.ActivityListViewAdvencedBinding

private lateinit var binding: ActivityListViewAdvencedBinding

class ListViewAdvanced : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewAdvencedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list = mutableListOf<OutData>()
        list.add(OutData(R.drawable.dog01, "Dog 01", "Description Dog 01"))
        list.add(OutData(R.drawable.dog02, "Dog 02", "Description Dog 02"))
        list.add(OutData(R.drawable.dog02, "Dog 02", "Description Dog 02"))
        list.add(OutData(R.drawable.dog02, "Dog 02", "Description Dog 02"))
        list.add(OutData(R.drawable.dog02, "Dog 02", "Description Dog 02"))
        list.add(OutData(R.drawable.dog03, "Dog 03", "Description Dog 03"))
        list.add(OutData(R.drawable.dog04, "Dog 04", "Description Dog 04"))

        customAdapter = CustomAdapter(this, list)
        binding.lvDog.adapter = customAdapter
    }
}