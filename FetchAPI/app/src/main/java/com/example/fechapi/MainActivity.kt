package com.example.fechapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fechapi.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL


private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Make the API request
        val url = "https://jsonplaceholder.typicode.com/posts"
        val request = URL(url).openConnection() as HttpURLConnection

        try {
            request.connectTimeout = 5000
            request.readTimeout = 5000
            request.requestMethod = "GET"
            request.doInput = true

            // Get the response
            request.connect()
            val inputStream = request.inputStream
            val response = convertStreamToString(inputStream)

            // Display the response in the text view
            binding.textView.text = response
        } finally {
            request.disconnect()
        }

    }

    private fun convertStreamToString(inputStream: InputStream): String {
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()

        var line = bufferedReader.readLine()
        while (line != null) {
            stringBuilder.append(line).append("\n")
            line = bufferedReader.readLine()
        }

        return stringBuilder.toString()
    }

}