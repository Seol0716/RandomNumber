package com.example.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //Transformations
    private var valueCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
    get() = valueCount


    //입력값을 받아와 LiveData에 저장하는 메소드
    fun setLiveDataValue(count : Int) {
        valueCount.value = count
    }

}