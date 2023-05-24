package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

//Live Data의 개념
//LiveData와 ViewModel과 결합
class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private var testMutableLiveData  = MutableLiveData(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        findViewById<Button>(R.id.btn).setOnClickListener{
            // testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
            mainViewModel.plusLiveDataValue()
        }

        //데이터를 관찰
        mainViewModel.testMutableLiveData.observe(this, Observer {
            //Log.d("MainActivity",testMutableLiveData.value.toString())
            //findViewById<TextView>(R.id.textValue).text = testMutableLiveData.value.toString()

            //viewModel의 MulableLiveData를 가져와서 저장
            findViewById<TextView>(R.id.textValue).text = mainViewModel.testMutableLiveData.value.toString()
        })
    }
}