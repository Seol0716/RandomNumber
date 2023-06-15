package com.example.retrofitexample2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val Base_uri = "https://jsonplaceholder.typicode.com/"

    val client = Retrofit.Builder().baseUrl(Base_uri).addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getInstance() : Retrofit {
        return client
    }
}