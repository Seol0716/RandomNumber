package com.example.fruitinformation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fruitinformation.api.Myapi
import com.example.fruitinformation.api.RetrofitInstance
import com.example.fruitinformation.model.Plant
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){


    val api =  RetrofitInstance.getInstance().create(Myapi::class.java)

    private val _result = MutableLiveData<List<Plant>>()
    val result : LiveData<List<Plant>>
    get()  = _result

    fun getAllData() = viewModelScope.launch {

        val postAll = api.getAllPlants()
        Log.d("Test",postAll.toString())
        _result.value = postAll
    }
}