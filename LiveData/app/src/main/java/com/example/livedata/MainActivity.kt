package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding
import com.example.livedata.databinding.ActivitytestBinding

//Live Data의 개념
//LiveData와 ViewModel과 결합
//LiveData와 MulableLiveData의 차이점
//fragment LiveData / viewlifecyclerOwner


class MainActivity : AppCompatActivity() {
//
//    private lateinit var mainViewModel: MainViewModel
//    private var testMutableLiveData  = MutableLiveData(0)

    private lateinit var binding  : ActivitytestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitytestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = supportFragmentManager

        binding.btn1.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment1 = BlankFragment1()

            transaction.replace(R.id.frame,fragment1).addToBackStack(null).commit()
        }

        binding.btn2.setOnClickListener {
            val transaction = manager.beginTransaction()
            val fragment2 = BlankFragment2()

            transaction.replace(R.id.frame,fragment2).addToBackStack(null).commit()
        }


//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//
//        findViewById<Button>(R.id.btn).setOnClickListener{
//          mainViewModel.plusLiveDataValue()
//        }
//
//        mainViewModel.testLiveData.observe(this, Observer {
//            findViewById<TextView>(R.id.textValue).text = it.toString()
//        })

//        mainViewModel.testLiveData.value = 10
//
//        데이터를 관찰
//        mainViewModel.testMutableLiveData.observe(this, Observer {
//            //Log.d("MainActivity",testMutableLiveData.value.toString())
//            //findViewById<TextView>(R.id.textValue).text = testMutableLiveData.value.toString()

//            //viewModel의 MulableLiveData를 가져와서 저장
//            findViewById<TextView>(R.id.textValue).text = it.toString()
//        })
//
//        mainViewModel.testMutableLiveData.value = 10


    }
}