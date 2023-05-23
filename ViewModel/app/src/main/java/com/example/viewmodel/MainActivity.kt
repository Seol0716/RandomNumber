package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


//안드로이드 샘영 주기를 관리를 관리하기 쉽다.
//onSaveInstanceState()를 사용해서 데이터를 관리할 수 있지만 소량의 데이터를 위주로 사용하는게 쉽다.
//ViewModel은 대량의 데이터를 사용하기에 적합하고 상태 변환 있을때마다 관리하기 편하다.
//Ui컨트롤러로 ViewModel을 사용하면 테스나 관리에 용이하다
//ViewModel은 ViewModel scope에서 생명주기 전체를 관리한다.


class MainActivity : AppCompatActivity() {

    // private var count = 0
    // lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        //ViewModel 연결
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        Log.d("MainActivity","onCreate")

        val plusBtn : Button = findViewById<Button>(R.id.plus)
        val minusBtn : Button = findViewById<Button>(R.id.minus)

        val result_text : TextView = findViewById(R.id.result)

        result_text.text = viewModel.countValue.toString()
        plusBtn.setOnClickListener{
            // count++
            // result_text.text = count.toString()
            viewModel.plus()
            result_text.text = viewModel.countValue.toString()
        }

        minusBtn.setOnClickListener {
            //count--

            //result_text.text = count.toString()
            viewModel.minus()
            result_text.text = viewModel.countValue.toString()
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MainActivity","onDestroy")
    }
    */

    }
}