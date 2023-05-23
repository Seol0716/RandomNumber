package com.example.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num : Int) : ViewModel() {
    //ViewModel에서 저렇게 아래와 같이 딸랑 변수 하나만 만들어서 사용하지는 않고
    //LiveData을 이용해서 사용


    //ViewModle Factory
    //Repository
    //네트워크 통신이나 DB 받아올때

    var countValue = 0

    init {
       // Log.d("MainViewModel","init")
        Log.d("MainViewModel",num.toString())
    }
    fun plus() {
        countValue++
        Log.d("MainViewModel",countValue.toString())
    }

    fun minus() {
        countValue--
        Log.d("MainViewModel",countValue.toString())
    }

    fun getCount() : Int {
        return countValue
    }
}