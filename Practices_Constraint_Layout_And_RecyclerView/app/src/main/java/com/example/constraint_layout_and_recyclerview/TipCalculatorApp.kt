package com.example.constraint_layout_and_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tip_calculator_app.*

class TipCalculatorApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_calculator_app)

        addEvent()

    }

    private fun addEvent() {
        btnDown.setOnClickListener() {
            var value: Int = edtTip.text.toString().toInt()
            value -= 1;
            edtTip.setText(value.toString())
            handlePrice(value)
        }

        btnUp.setOnClickListener() {
            var value: Int = edtTip.text.toString().toInt()
            value += 1;
            edtTip.setText(value.toString())
            handlePrice(value)
        }


    }

    private fun handlePrice(value: Int) {
        var bill: Double = edtBill.text.toString().toDouble()
        var tip: Double = (bill / 100) * value
        var total: Double = bill + tip
        edtTipResult.setText(tip.toString())
        edtTotal.setText(total.toString())
    }
}