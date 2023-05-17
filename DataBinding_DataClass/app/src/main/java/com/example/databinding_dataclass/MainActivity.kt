package com.example.databinding_dataclass

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding_dataclass.databinding.ActivityMainBinding

//DataBinding
//이름처럼 뭔가 데이터를 어쩌고 저쩌고 해줄 수 없을까??? 연결
//데이터 결합

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var testCount = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //주의 정수형은 문자형으로 형변환환
       val person  = Person("개복치",20)
        binding.user = person
    }

    fun myClick(view : View){
        Log.d("MainActivity","on")
        testCount++

        val person  = Person("개복치",testCount)
        binding.user = person
    }
}