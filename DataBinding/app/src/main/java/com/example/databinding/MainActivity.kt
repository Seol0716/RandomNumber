package com.example.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

//DataBinding
//ViewBinding 이랑 뭐가 다른가
//이름처럼 데이터를 연결해주는 역할
//DataBinding + LiveData


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.dataBinding.text = "바뀐 텍스트"

        binding.dataBinding.setOnClickListener {
            val intent = Intent(this,Second::class.java)
            startActivity(intent)
        }

    }
}