package com.example.project.MainViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.project.DataEntity.Data
import com.example.project.Repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel(application: Application) : AndroidViewModel(application){

    val context = getApplication<Application>().applicationContext

    //카운트 데이터 셋
    private var _countData = MutableLiveData<Int>(0)

    val countData : LiveData<Int>
        get() = _countData

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


    //name 데이터 셋
    private var _nameData = MutableLiveData<Data>()
    val nameData : LiveData<Data>
        get() = _nameData

    val repository = Repository(context)
    fun insert(name : String) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(name)
    }

    fun delete() = viewModelScope.launch(Dispatchers.IO) {
        repository.delete()
    }
}