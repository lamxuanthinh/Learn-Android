package com.example.listviewbasic

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView



class CustomAdapter(val activity: Activity, val list: List<OutData>) :
    ArrayAdapter<OutData>(activity, R.layout.list_item) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexs = activity.layoutInflater
        val rowView = contexs.inflate(R.layout.list_item, parent, false)

        val image = rowView.findViewById<ImageView>(R.id.images)
        val title = rowView.findViewById<TextView>(R.id.txtTitle)
        val description = rowView.findViewById<TextView>(R.id.txtDescription)

        title.text = list[position].title
        description.text = list[position].description
        image.setImageResource(list[position].image)


        return rowView
    }
}