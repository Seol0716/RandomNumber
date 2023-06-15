package com.example.retrofitexample3.Api



import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val Base_URI = "https://raw.githubusercontent.com/"

    val client = Retrofit
        .Builder().baseUrl(Base_URI)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getInstance() : Retrofit {
        return client
    }

}
