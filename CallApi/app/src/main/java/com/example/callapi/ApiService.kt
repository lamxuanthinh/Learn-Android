package com.example.callapi

import android.icu.util.TimeUnit
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    private const val BASE_URL = "http://192.168.56.1:81/studentws/"
    private val gson = GsonBuilder().create()
    private val okHttpClient = OkHttpClient.Builder()
    .connectTimeout(30, TimeUnit.SECONDS) .readTimeout(30, TimeUnit.SECONDS) .build()
    private val retrofit = Retrofit.Builder() .baseUrl(BASE_URL)
        .client(okHttpClient) .addConverterFactory(GsonConverterFactory.create(gson)) .build()
    fun create(): StudentApi {
        return retrofit.create(StudentApi::class.java)
    }
}