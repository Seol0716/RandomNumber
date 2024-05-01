package com.example.mvvm_pratice.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm_pratice.Model.Repository
import com.example.mvvm_pratice.Room.DataEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel(application: Application) : AndroidViewModel(application){

    val context = getApplication<Application>().applicationContext
    val repository = Repository(context)

    //카운트 데이터 셋
    private var _countData = MutableLiveData<Int>(0)

    val countData : LiveData<Int>
        get() = _countData

    //전체 카운터 셋
    private var _all_count = MutableLiveData<Int>()

    val all_count : LiveData<Int>
        get() = _all_count

    //랜덤카운터 셋
    private var _randomCount = MutableLiveData<Int>()

    val randomCount : LiveData<Int>
        get() = _randomCount


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


    //전체 데이터 수
    fun getCount() = CoroutineScope(Dispatchers.IO).launch {
        repository.getCount()
    }
    fun getRandomCount(Random_index : Int) = CoroutineScope(Dispatchers.IO).launch {
        val count = repository.getRandomCount(Random_index)
        _randomCount.value = count
    }

    fun insert(name : String) = CoroutineScope(Dispatchers.IO).launch {
        repository.insert(name)
    }

    fun Delete() = CoroutineScope(Dispatchers.IO).launch {
        repository.getDelete()
    }
}