package com.example.practices_sqlite

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.practices_sqlite.databinding.ActivityMain2Binding

private lateinit var binding: ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val helper = MyDbHelper(this)
        var arrayList: ArrayList<OutData> = helper!!.readDog()


        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        binding.rvDog.adapter = RvAdapter(arrayList, object : RvInterface {

            override fun onClickDelete(position: Int) {
                var check = false
                var ad = AlertDialog.Builder(this@MainActivity2)
                ad.setTitle("Delete")
                ad.setMessage("Do you want delete Dog")
                ad.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
                    //delete
                    helper.delete(arrayList[position].name)
                    // reload activity
                    val intent = Intent(this@MainActivity2, MainActivity2::class.java)
                    startActivity(intent)
                    finish();
                })

                ad.show()
            }


            override fun onClickUpdate(position: Int) {
                val build = AlertDialog.Builder(this@MainActivity2)
                val view = layoutInflater.inflate(R.layout.layout_update, null)
                build.setView(view)
                dialog = build.create()
                dialog.show()

                val edtImage = view.findViewById<TextView>(R.id.edtImageUpdate)
                val edtName = view.findViewById<TextView>(R.id.edtNameUpdate)
                val update = view.findViewById<Button>(R.id.btnUpdate)

                edtImage.text = arrayList[position].image
                edtName.text = arrayList[position].name
                val original = arrayList[position].name

                update.setOnClickListener {
                    val image = edtImage.text.toString()
                    val name = edtName.text.toString()
                    // update
                    helper.update(original, image, name)
                    // reload activity
                    val intent = Intent(this@MainActivity2, MainActivity2::class.java)
                    startActivity(intent)
                    finish();

                    dialog.dismiss()
                }

            }
        })

        binding.rvDog.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )

    }

}