package com.example.mvvm_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_pratice.Room.DataEntity
import com.example.mvvm_pratice.ViewModel.MainViewModel
import com.example.mvvm_pratice.databinding.ActivityMainBinding

import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var linear: LinearLayout
    private lateinit var viewModel: MainViewModel
    var num: Int = 0
    private lateinit var data: DataEntity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        linear = findViewById(R.id.linear)
        //minus 기능
        binding.minusBtn.setOnClickListener {
            viewModel.minus_count()
        }

        //플러스 기능
        binding.plusBtn.setOnClickListener {
            viewModel.plus_count()
        }


        //라이브 데이터를 관찰하여 textView에 카운터 표시
        viewModel.countData.observe(this, Observer {

            binding.countData.text = it.toString()

        })

        viewModel.name.observe(this) {
            binding.winText.text = it.toString()
        }

        //데이터 입력 이벤트
        binding.createBtn.setOnClickListener {
//            Log.d("test",binding.countData.text.toString())
            num = binding.countData.text.toString().toInt()

            for (i in 1..num) {
                linear.visibility = View.VISIBLE

                //동적EditText 생성
                var edit: EditText = EditText(this)
                val editparams = LinearLayout.LayoutParams(
                    600, 130
                )

                editparams.topMargin = 40
                editparams.gravity = Gravity.CENTER
                edit.layoutParams = editparams
                edit.id = i;
                edit.setBackgroundResource(R.drawable.edittext_custom)
                linear.addView(edit)
            }
        }

        //데이터 저장 이벤트
        binding.checkBtn.setOnClickListener {

            //초기화
            viewModel.reset_count()
            for (i in 1..num) {

                //linearLayout의 edittext id값을 불러온다
                var et: EditText? = linear?.findViewById<EditText>(i)

                //그 값을 ROOM에 저장
                viewModel.insert(et?.text.toString())


                linear?.removeAllViews()
            }

//            //삭제버튼
//            binding.deleteBtn.setOnClickListener {
//                viewModel.reset_count()
//                viewModel.Delete()
//            }

//            //랜덤이름뽑기
//            binding.startBtn.setOnClickListener {
//
//                viewModel.getRandomName()
//                //랜덤 데이터 뽑기
//                //전체 데이터를 받아와 랜덤으로 뽑아
//            }
        }
    }
}