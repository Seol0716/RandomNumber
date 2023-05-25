package com.example.randomtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.randomtext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //LiveData + ViewModel + DataBinding

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.vm = viewModel

        //라이프 사이클 관리
        binding.lifecycleOwner = this

        //뷰에 바로 연결
        binding.btn.setOnClickListener {
            viewModel.getNextData()
        }
    }
}