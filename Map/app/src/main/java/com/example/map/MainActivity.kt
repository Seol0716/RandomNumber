package com.example.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.map.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        //버튼 클릭시 카운트의 값을 뷰 모델의 LiveData에 저장
        binding.btn.setOnClickListener {
            val count = binding.edit.text.toString().toInt()
            viewModel.setLiveDataValue(count)

        }

        //map
        viewModel.plus_data.observe(this, Observer {
            binding.text1.text = it.toString()

        })

        viewModel.gob_data.observe(this, Observer {
            binding.text2.text = it.toString()
        })

        //switch
        //+
        viewModel.plus_LiveData.observe(this, Observer {
            binding.text1.text = it.toString()
        })

        viewModel.gob_LiveData.observe(this, Observer {
            binding.text2.text = it.toString()
        })
//
//        //관찰
//        viewModel.liveCount.observe(this, Observer {
////            binding.text1.text = (it + it).toString()
////              binding.text2.text = (it * it).toString()
//
//        })
    }
}