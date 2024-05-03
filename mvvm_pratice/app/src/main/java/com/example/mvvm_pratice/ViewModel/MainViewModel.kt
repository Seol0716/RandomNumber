package com.example.mvvm_pratice.ViewModel

import android.app.Application
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


class MainViewModel :ViewModel() {

    //뽑힌 번호
    private var _winner = MutableLiveData<Int>()

    val winner : LiveData<Int>
        get() = _winner
    
    init {
        _winner.value = 0
    }

    //랜덤번호 뽑기

    fun getRandomNumber( number : Int){

        val random_number = Random.nextInt(number)
        _winner.value = random_number
    }
}