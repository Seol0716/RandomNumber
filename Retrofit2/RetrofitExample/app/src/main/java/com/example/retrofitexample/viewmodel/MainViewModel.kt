package com.example.retrofitexample.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitexample.api.Myapi
import com.example.retrofitexample.api.RetrofitInstance
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    //Retrofit 객체생성
    private val retrofitInstance = RetrofitInstance.getInstance().create(Myapi::class.java)

    //Post1의 데이터를 담음
    private var muableword1 = MutableLiveData<String>()
    val liveword1 : LiveData<String>
    get() = muableword1


    //getPostNumber의 데이터를 담음
    private var muableword2 = MutableLiveData<String>()
    val liveword2 : LiveData<String>
        get() = muableword2



    //viewMdelScope는 viewModel이 생성될때 사용가능
    //viewModel이 실행될때 데이터를 확인하여 관리해준다.
    fun getPost1() = viewModelScope.launch {

        //서버에 있는 데이터를 받아와서 Mutablelivedata에 받아온다
        //데이터 설정
        val post = retrofitInstance.getPost1()
        Log.d("MainViewModel",post.toString())
        muableword1.value = post.title
    }


    //viewMdelScope는 viewModel이 생성될때 사용가능
    //viewModel이 실행될때 데이터를 확인하여 관리해준다.
    fun getPostNumber(number : Int) = viewModelScope.launch {


        //서버에 있는 데이터를 받아와서 Mutablelivedata에 받아온다
        //데이터 설정
        val number = retrofitInstance.getPostNumber(number)
        Log.d("number",number.toString())
        muableword2.value = number.id.toString()
    }
}