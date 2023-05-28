package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface MyApi {

    @GET("posts/1")
    fun getPost1() : Call<Post>

    @GET("posts/{number}")
    fun getPostNumber(
        @Path("number") number : Int
    ) : Call<Post>

    //함수를 쓸려면 Call<post>를 받아와야됌
    @GET("posts/{id}")
    fun getId(
        @Path("id") id : Int
    ) : Call<Post>

}