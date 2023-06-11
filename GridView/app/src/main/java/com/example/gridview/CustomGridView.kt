package com.example.gridview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomGridView(val activity: Activity, val list: List<OutData>) :
    ArrayAdapter<OutData>(activity, R.layout.layout_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexts = activity.layoutInflater
        val rowView = contexts.inflate(R.layout.layout_item, parent, false)

        val images = rowView.findViewById<ImageView>(R.id.imgFilm)
        val nameFilm = rowView.findViewById<TextView>(R.id.txtNameFilm)

        images.setImageResource(list[position].images)
        nameFilm.text = list[position].nameFilm

        return rowView
    }
}