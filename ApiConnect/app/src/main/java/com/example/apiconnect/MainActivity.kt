package com.example.apiconnect

import kotlinx.coroutines.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.Dispatcher

class MainActivity : AppCompatActivity() {

    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
    }

    private  fun loadData() {
        val studentApi = RetrofitClient.create()
        // bug in " -> CoroutineScope"
        CoroutineScope(Dispatcher.IO).launch {
            val response = studentApi.getStudents()
            val students = gson.fromJson<List<String>>(response.string(), object : TypeToken<List<Student>>() {}.type)
            withContext(Dispatcher.Main) {

            }
        }
        val response = studentApi.getStudents()
    }
}