package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Response


import javax.security.auth.callback.Callback


class MainActivity : AppCompatActivity() {

    //Retrofit Server
    //데이터를 받아올때 Server(Retrofit2) 나 LocalDB(Room)
    //코루틴 코드를 비동기적(콜백함수)으로 실행되는 코드를 간소화하기 위해 사용하는 동시 실행설계패턴

    //ViewModel
    //WorkManager

    //Simple Retrofit 예제

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val api = RetrofitInstance.getInstance().create(MyApi::class.java)
        api.getPost1().enqueue(object : retrofit2.Callback<Post> {

            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                Log.d("API1", "sucess!")
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.d("API1", "fail")
            }

        })


    }
}