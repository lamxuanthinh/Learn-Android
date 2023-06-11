package com.example.fechapi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class RvAdapter(var list: List<Student>) : RecyclerView.Adapter<RvAdapter.StudentViewHolder>() {
    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): StudentViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item, p0, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(p0: StudentViewHolder, position: Int) {

        p0.itemView.apply {
            val name = findViewById<TextView>(R.id.nameTextView)
            val email = findViewById<TextView>(R.id.emailTextView)
            val phone = findViewById<TextView>(R.id.phoneTextView)

            name.text =  list[position].name
            email.text = list[position].email
            phone.text = list[position].phone
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
