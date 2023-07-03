package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.mainViewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //컴포넌트 초기화

        //minus 기능
        binding.minusBtn.setOnClickListener{
            viewModel.minus_count()
        }

        //플러스 기능
        binding.plusBtn.setOnClickListener{
            viewModel.plus_count()
        }

        //라이브 데이터를 관찰하여 textView에 카운터 표시
        viewModel.countData.observe(this, Observer {
            binding.countData.text = it.toString()
        })
    }
}