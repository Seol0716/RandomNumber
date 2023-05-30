package com.example.retrofit

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response


import javax.security.auth.callback.Callback


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //Retrofit Server
    //데이터를 받아올때 Server(Retrofit2) 나 LocalDB(Room)
    //코루틴 코드를 비동기적(콜백함수)으로 실행되는 코드를 간소화하기 위해 사용하는 동시 실행설계패턴

    //ViewModel
    //WorkManager

    //Simple Retrofit 예제
    //retrofit 비동기적 실행

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this,)

//
//        //비동기적
//        val api1 = RetrofitInstance.getInstance().create(MyApi::class.java)
//
//        api.getPost1().enqueue(object : retrofit2.Callback<Post> {
//
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                Log.d("API1", response.body().toString())
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API1", "fail")
//            }
//        })
//
//        //number 인덱스 4번째에 있는 uid,id,title, body 등 모든 정보를 보여줌
//        api.getPostNumber(4).enqueue(object : retrofit2.Callback<Post> {
//
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                Log.d("API2", response.body().toString())
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API2", "fail")
//            }
//        })
//
//        api.getId(20).enqueue(object : retrofit2.Callback<Post>{
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//
//                Log.d("API3",response.body().toString())
//
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API3", "fail")
//            }
//        })


        //동기적 예제
        val api2 = RetrofitInstance.getInstance().create(MyApi::class.java)

        api2.getPost1().enqueue(object : retrofit2.Callback<Post> {

            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                Log.d("API1", response.body().toString())


                //number 인덱스 4번째에 있는 uid,id,title, body 등 모든 정보를 보여줌
                api2.getPostNumber(4).enqueue(object : retrofit2.Callback<Post> {

                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
                        Log.d("API2", response.body().toString())
                    }

                    override fun onFailure(call: Call<Post>, t: Throwable) {
                        Log.d("API2", "fail")
                    }
                })
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.d("API1", "fail")
            }
        })


//
//        //number 인덱스 4번째에 있는 uid,id,title, body 등 모든 정보를 보여줌
//        api2.getPostNumber(4).enqueue(object : retrofit2.Callback<Post> {
//
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                Log.d("API2", response.body().toString())
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API2", "fail")
//            }
//        })
//
//        api2.getId(20).enqueue(object : retrofit2.Callback<Post>{
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//
//                Log.d("API3",response.body().toString())
//
//            }
//
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                Log.d("API3", "fail")
//            }
//        })

    }
}