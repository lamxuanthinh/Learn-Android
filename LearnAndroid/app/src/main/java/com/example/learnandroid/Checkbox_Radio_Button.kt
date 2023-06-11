package com.example.learnandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_checkbox_radio_button.*

class Checkbox_Radio_Button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_radio_button)

        addEvents()
    }

    private fun addEvents() {
        btnSubmit.setOnClickListener() {
            isFeel()
        }

        btnSubmitGender.setOnClickListener() {
            isGender()
        }
    }

    private fun isGender() {
       var gender: String = ""
        if(radFemale.isChecked) {
                gender = radFemale.text.toString()
        }else if (radMale.isChecked){
            gender = radMale.text.toString()
        }else {
            Toast.makeText(this, "Please enter gender", Toast.LENGTH_LONG).show()
        }
    }

    private fun isFeel() {
        var fell: String = ""
        if (chkGood.isChecked) {
            fell = chkGood.text.toString()
        }
        if (chkNotBad.isChecked) {
            fell = chkGood.text.toString()
        }
        if (chkSick.isChecked) {
            fell = chkGood.text.toString()
        }
        edtFeel.setText(fell)
    }


}