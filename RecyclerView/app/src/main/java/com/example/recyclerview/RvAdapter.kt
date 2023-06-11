package com.example.recyclerview

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.TooltipCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class RvAdapter(var list: List<OutData>, val onClick: RvInterface) : RecyclerView.Adapter<RvAdapter.FilmViewHolder>() {
    inner class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FilmViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item, p0, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(p0: FilmViewHolder, position: Int) {

        p0.itemView.apply {
            val imgFilm = findViewById<ImageView>(R.id.imgFilm)
            val nameFilm = findViewById<TextView>(R.id.txtName)
            val description = findViewById<TextView>(R.id.txtDescription)

            imgFilm.setImageResource(list[position].image)
            nameFilm.text = list[position].nameFilm
            description.text = list[position].description

            p0.itemView.setOnClickListener{
                onClick.onClickFilm(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}