package com.example.practices_sqlite


import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AlertDialog
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class RvAdapter(var arrayList: ArrayList<OutData>, val onClick: RvInterface) :
    RecyclerView.Adapter<RvAdapter.DogViewHolder>() {


    inner class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DogViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item, p0, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(p0: DogViewHolder, position: Int) {


        p0.itemView.apply {
            val txtImage = findViewById<TextView>(R.id.txtImage)
            val textName = findViewById<TextView>(R.id.txtName)
            val delete = findViewById<ImageView>(R.id.imgDelete)
            val update = findViewById<ImageView>(R.id.imgUpdate)


            txtImage.text = arrayList[position].image
            textName.text = arrayList[position].name

            delete.setOnClickListener {
                val result = onClick.onClickDelete(position)
            }

            update.setOnClickListener {
                onClick.onClickUpdate(position)
            }


        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}