package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface  MyApi {

    @GET("posts/1")
    fun getPost1() : Call<Post>


    //동적으로 데이터 가져오기
    @GET("posts/{id}")
    fun getPostNumber(
        @Path("id") number : Int
    ) : Call<Post>

}