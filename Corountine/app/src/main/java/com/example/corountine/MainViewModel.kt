package com.example.corountine

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    fun a() {
        CoroutineScope(Dispatchers.IO).launch {
            for(i in 0..10){
                delay(1000)
                Log.d("Test1",i.toString())
            }
        }
    }

    fun b() {
        viewModelScope.launch {
            for(i in 0..10){
                delay(1000)
                Log.d("Test2",i.toString())
            }
        }
    }
}