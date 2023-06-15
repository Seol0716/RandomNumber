package com.example.retrofitexample3.Repository

import com.example.retrofitexample3.Api.RetrofitInstance
import com.example.retrofitexample3.Api.Myapi

class Repository {


    private val client = RetrofitInstance.getInstance().create(Myapi::class.java)

    suspend fun getAllData() = client.getAllPlants()
}