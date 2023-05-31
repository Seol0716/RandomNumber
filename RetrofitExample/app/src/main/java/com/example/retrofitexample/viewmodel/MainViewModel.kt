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

    private val retrofitInstance = RetrofitInstance.getInstance().create(Myapi::class.java)

    private var muableword1 = MutableLiveData<String>()
    val liveword1 : LiveData<String>
    get() = muableword1


    private var muableword2 = MutableLiveData<String>()
    val liveword2 : LiveData<String>
        get() = muableword2



    fun getPost1() = viewModelScope.launch {

        val post = retrofitInstance.getPost1()
        Log.d("MainViewModel",post.toString())
        muableword1.value = post.title
    }

    fun getPostNumber(number : Int) = viewModelScope.launch {
        val number = retrofitInstance.getPostNumber(number)
        Log.d("number",number.toString())
        muableword2.value = number.id.toString()
    }
}