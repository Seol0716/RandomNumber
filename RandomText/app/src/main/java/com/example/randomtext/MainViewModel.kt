package com.example.randomtext

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var MutableWord = MutableLiveData("")
    val liveWord : LiveData<String>
    get() = MutableWord


    private var randomMutableWord = MutableLiveData("")
    val randomliveWord : LiveData<String>
        get() = randomMutableWord

    val newData = Transformations.switchMap(liveWord){
        getRandomWord(it)
    }

    init {
        getNextData()
    }

    fun getNextData(){
        val word = testDataList.random()
        val randomWord = word.toCharArray()
        randomWord.shuffle()
        MutableWord.value = word
        randomMutableWord.value = String(randomWord)
    }

    fun getRandomWord(word : String) : MutableLiveData<String>{
        val liveData = MutableLiveData("")
        val randText = word.toCharArray()
        randText.shuffle()
        liveData.value = String(randText)
        return liveData
    }

}