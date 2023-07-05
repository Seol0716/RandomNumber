package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.project.MainViewModel.MainViewModel
import com.example.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var linear : LinearLayout
    private lateinit var edit : EditText
    private lateinit var viewModel : MainViewModel
    var num : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        //컴포넌트 초기화


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        linear = findViewById(R.id.linear)
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

        //데이터 입력 이벤트
        binding.createBtn.setOnClickListener{
//            Log.d("test",binding.countData.text.toString())
            num = binding.countData.text.toString().toInt()

            for(i in 1.. num){
                linear.visibility = View.VISIBLE

                //동적EditText 생성
                edit = EditText(this)
                val editparams = LinearLayout.LayoutParams(
                    600, 130
                )

                editparams.topMargin = 40
                editparams.gravity = Gravity.CENTER
                edit.layoutParams = editparams
                edit.id = i;
                linear.addView(edit)

                Log.d("Test3",edit.id.toString())

            }

            viewModel.reset_count()
        }

        //데이터 저장
        binding.checkBtn.setOnClickListener{
            viewModel.reset_count()

//            Log.d("Test2",num.toString())
            for(i in 0..num){

                edit = (linear.getChildAt(i) as EditText?)!!
                Log.d("Test4",edit.text.toString())
                Log.d("Test1",edit.id.toString())
            }

        }
    }
}