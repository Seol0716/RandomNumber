package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
//
    //초기화
    private var testMutableLiveData = MutableLiveData(0)

    val testLiveData : LiveData<Int>
        get() = testMutableLiveData



//
    //플러스 메소드
    fun plusLiveDataValue() {
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }
//
//    private var testMulableLiveData = MutableLiveData(0)
//
//    fun plusLiveDataValue () {
//        testMulableLiveData.value  = testLiveData.value!!.plus(1)
//    }


}