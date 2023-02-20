package com.example.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.optionsmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.message -> {
                Toast.makeText(
                    this, "You clicked Message menu", Toast.LENGTH_SHORT
                ).show()
                return true
            }
            R.id.picture -> {
                Toast.makeText(
                    getApplicationContext(), "You clicked Picture menu", Toast.LENGTH_SHORT
                ).show()
                return (true)
            }
            R.id.mode -> {
                Toast.makeText(getApplicationContext(), "You clicked Mode menu", Toast.LENGTH_SHORT)
                    .show()
                return (true)
            }
            R.id.option_favorites1 -> {
                Toast.makeText(
                    getApplicationContext(), "You clicked Music menu", Toast.LENGTH_SHORT
                ).show()
                return (true)
            }
            R.id.option_favorites2 -> {
                Toast.makeText(getApplicationContext(), "You clicked Book menu", Toast.LENGTH_SHORT)
                    .show()
                return (true)
            }
            R.id.about -> {
                Toast.makeText(
                    getApplicationContext(), "You clicked About menu", Toast.LENGTH_SHORT
                ).show()
                return (true)
            }
            R.id.exit -> {
                finish()
                return (true)
            }
        }
        return (super.onOptionsItemSelected(item))
    }
}