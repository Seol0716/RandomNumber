package com.example.mvvm_pratice.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_pratice.Model.Repository
import com.example.mvvm_pratice.Room.DataEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel(private val repository: Repository) : ViewModel() {


    //카운트 데이터 셋
    private var _countData = MutableLiveData<Int>(0)

    val countData : LiveData<Int>
        get() = _countData

   private val _name = MutableLiveData<String>()
    val name : LiveData<String>
        get() = _name


    //마이너스
    fun minus_count() {
        _countData.value = _countData.value!!.minus(1)
    }

    //카운트 플러스
    fun plus_count() {
        _countData.value = _countData.value!!.plus(1)
    }

    fun reset_count() {
        _countData.value = 0
    }

    fun getRandomName() {

        viewModelScope.launch {
            val randomId = repository.getRandomId()
            val name = repository.getNameById(randomId)
            _name.postValue(name.toString())
        }
    }

    fun insert(name : String) = CoroutineScope(Dispatchers.IO).launch {
        repository.insert(name)
    }

//    fun Delete() = CoroutineScope(Dispatchers.IO).launch {
//        repository.getDelete()
//    }
}