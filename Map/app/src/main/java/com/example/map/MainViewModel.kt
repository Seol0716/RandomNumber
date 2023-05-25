package com.example.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //Transformations -> Map / switchMap

    //map -> 값을 return


    private var valueCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
    get() = valueCount


    //입력값을 받아와 LiveData에 저장하는 메소드
    fun setLiveDataValue(count : Int) {
        valueCount.value = count
    }


    //Map
    //map은 LiveData의 값을 반환
    //더하기
    val plus_data = Transformations.map(liveCount){
        it + it
    }

    //곱하기
    val gob_data = Transformations.map(liveCount){
        it * it
    }

    //Switch
    val gob_LiveData = Transformations.switchMap(liveCount){
        plus_Value(it)
    }

    //더하기
    fun plus_Value(count : Int) : MutableLiveData<Int> {
        val testData  = MutableLiveData(count + count)
        return testData
    }
    //switch는 LiveData를 반환
    val plus_LiveData = Transformations.switchMap(liveCount){
        gob_Value(it)
    }

    //switch 곱하기
    fun gob_Value(count : Int) : MutableLiveData<Int> {
        val testData  = MutableLiveData(count * count)
        return testData
    }
}