package com.example.practices_handling_action

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginApp_1 : AppCompatActivity() {

    public var edtUsername: EditText? = null
    public var edtPassword: EditText? = null
    public var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_1_app)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }

    fun onLogin(view: View?) {
        if (edtUsername!!.getText().toString().equals("admin") && edtPassword!!.getText().toString()
                .equals("12345")
        ) {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_LONG).show()
        }
    }
}