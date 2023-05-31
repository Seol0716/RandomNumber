package com.example.retrofitexample.api

import com.example.retrofitexample.model.Post
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Myapi {

    @GET("posts/1")
    suspend fun getPost1() : Post

    @GET("posts/{number}")
    suspend fun getPostNumber(
        @Path("number") number : Int
    ) : Post

}