package com.example.practices_handling_action

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SimpleCalculatorApp : AppCompatActivity() {

    public var edtNum1: EditText? = null
    public var edtNum2: EditText? = null
    public var btnAddition: Button? = null
    public var btnSubtraction: Button? = null
    public var btnMultiplication: Button? = null
    public var btnDivision: Button? = null
    public var edtResult: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculator_app)

        edtNum1 = findViewById(R.id.edtNum1)
        edtNum2 = findViewById(R.id.edtNum2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)
        edtResult = findViewById(R.id.edtResult)



        btnAddition!!.setOnClickListener() {
            var valueNum1 = edtNum1!!.text.toString().toInt();
            var valueNum2 = edtNum2!!.text.toString().toInt();
            var valueResult = valueNum1 + valueNum2
            edtResult!!.setText(valueResult.toString())
        }

        btnSubtraction!!.setOnClickListener() {
            var valueNum1 = edtNum1!!.text.toString().toInt();
            var valueNum2 = edtNum2!!.text.toString().toInt();
            var valueResult = valueNum1 - valueNum2
            edtResult!!.setText(valueResult.toString())
        }

        btnMultiplication!!.setOnClickListener() {
            var valueNum1 = edtNum1!!.text.toString().toInt();
            var valueNum2 = edtNum2!!.text.toString().toInt();
            var valueResult = valueNum1 * valueNum2
            edtResult!!.setText(valueResult.toString())
        }

        btnDivision!!.setOnClickListener() {
            var valueNum1 = edtNum1!!.text.toString().toInt();
            var valueNum2 = edtNum2!!.text.toString().toInt();

            if (valueNum2 != 0) {
                var valueResult = valueNum1 / valueNum2
                edtResult!!.setText(valueResult.toString())
            }else {
                Toast.makeText(this, "Num 2 shouldn't equals 0", Toast.LENGTH_LONG).show()
            }

        }


    }
}