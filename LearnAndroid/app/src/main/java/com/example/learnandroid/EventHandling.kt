package com.example.learnandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EventHandling : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_handling)

        val txta = findViewById<TextView>(R.id.txta)
        val edta = findViewById<EditText>(R.id.edta)
        val txtb = findViewById<TextView>(R.id.txtb)
        val edtb = findViewById<EditText>(R.id.edtb)
        val edtKetqua = findViewById<EditText>(R.id.edtKetqua)
        val btnCong = findViewById<Button>(R.id.btnCong)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnCong.setOnClickListener() {
            val a = edta.text.toString().toInt();
            val b = edtb.text.toString().toInt();
            val ketqua = a + b;
            edtKetqua.setText(ketqua.toString())
        }

        btnReset.setOnClickListener() {
            edta.setText("")
            edtb.setText("")
            edtKetqua.setText("")
            Toast.makeText(this,"xoa het", Toast.LENGTH_LONG).show()
        }

    }
}