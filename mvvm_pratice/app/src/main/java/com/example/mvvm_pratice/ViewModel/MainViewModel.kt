package com.example.mvvm_pratice.ViewModel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt


class MainViewModel :ViewModel() {

    var number : Int = 0;

    //뽑힌

    //번호의 범위 저장
    fun SetNumber( number : Int){
        this.number = number
    }

    val _randomNumber = MutableLiveData<Int>()

    val randomNumber : LiveData<Int>
        get() = _randomNumber

    //랜덤뽑기
    fun getRandomNumber(){
        _randomNumber.value = Random.nextInt(1..number)
    }
}