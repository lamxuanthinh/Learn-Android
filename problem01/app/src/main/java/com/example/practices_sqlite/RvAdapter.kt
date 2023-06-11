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


class RvAdapter(var arrayList: ArrayList<OutData>) :
    RecyclerView.Adapter<RvAdapter.DogViewHolder>() {


    inner class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DogViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item, p0, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(p0: DogViewHolder, position: Int) {


        p0.itemView.apply {
            val edtName = findViewById<TextView>(R.id.txtName)
            val edtPhone = findViewById<TextView>(R.id.txtPhone)
            val edtEmail = findViewById<TextView>(R.id.txtEmail)


            edtName.text = arrayList[position].name
            edtPhone.text = arrayList[position].phone
            edtEmail.text = arrayList[position].email
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}