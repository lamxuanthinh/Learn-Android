package com.example.callapi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RvAdapter(var list: List<OutData>) : RecyclerView.Adapter<RvAdapter.FilmViewHolder>() {
    inner class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FilmViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_api, p0, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(p0: FilmViewHolder, position: Int) {

        p0.itemView.apply {

            val id = findViewById<TextView>(R.id.txtId)
            val name = findViewById<TextView>(R.id.txtName)
            val email = findViewById<TextView>(R.id.txtEmail)
            val phone = findViewById<TextView>(R.id.txtPhone)

            id.text = list[position].id.toString()
            name.text = list[position].name
            email.text = list[position].email
            phone.text = list[position].phone
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}