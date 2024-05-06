package com.example.mvvm_pratice.ViewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.mvvm_pratice.Model.DataEntity
import com.example.mvvm_pratice.Repositoryim
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.Console
import kotlin.random.Random
import kotlin.random.nextInt


class MainViewModel(application: Application) : AndroidViewModel(application) {

    var context = getApplication<Application>().applicationContext
    var number = 0
    //뽑힌
    var randomData = 0
    val repository = Repositoryim(application)


    //번호의 범위 저장
    fun SetNumber( number : Int){
        this.number = number
    }

    var _randomNumber = MutableLiveData<Int>()

    val randomNumber : LiveData<Int>
        get() = _randomNumber





    suspend fun update(){
        repository.update(DataEntity(randomData))
    }


    //랜덤뽑기
    fun getRandomNumber(){
        this.randomData = Random.nextInt(1..number)

        CoroutineScope(Dispatchers.IO).launch{
            repository.insert(DataEntity(randomData))
        }
        _randomNumber.value = randomData

        CoroutineScope(Dispatchers.IO).launch {
            repository.getAll()
        }

    }
}