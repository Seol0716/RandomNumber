package com.example.mvvm_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.mvvm_pratice.Model.DataEntity
import com.example.mvvm_pratice.ViewModel.MainViewModel
import com.example.mvvm_pratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    var num: Int = 0
    private lateinit var data: DataEntity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.randomNumber.observe(this){

            binding.winText.text = it.toString()
        }

        //범위저장
        binding.addBtn.setOnClickListener {
            val test = binding.edit.text.toString().toInt()
            viewModel.SetNumber(test)
            binding.edit.text = null
            Toast.makeText(this,"저장되었습니다",Toast.LENGTH_SHORT).show()
        }

        //뽑기
        binding.randomBtn.setOnClickListener {
                viewModel.getRandomNumber()
        }
    }
}