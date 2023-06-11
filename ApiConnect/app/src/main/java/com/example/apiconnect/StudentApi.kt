package com.example.apiconnect

import okhttp3.ResponseBody
import retrofit2.http.GET

interface StudentApi {
    @GET("display.php")
    suspend fun getStudents(): ResponseBody
}