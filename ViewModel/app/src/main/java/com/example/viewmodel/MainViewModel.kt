package com.example.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    //ViewModel에서 저렇게 아래와 같이 딸랑 변수 하나만 만들어서 사용하지는 않고
    //LiveData을 이용해서 사용

    var countValue = 0

    init {
        Log.d("MainViewModel","init")
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