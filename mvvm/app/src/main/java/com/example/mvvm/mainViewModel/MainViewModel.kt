package com.example.mvvm.mainViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

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

    //이름 데이터 넣기
    fun insert(name : String) = viewModelScope.launch {

    }
}