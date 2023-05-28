package com.example.corountine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//코루틴 ViewModelScope
//코루틴 비동기적 코드를 간소화하기 위해

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        var btn : Button = findViewById(R.id.btn1)
//        btn.setOnClickListener{
//            val intent = Intent(this,SecondActivity::class.java)
//            startActivity(intent)
//        }

        Log.d("Test","START")

        CoroutineScope(Dispatchers.IO).launch {
            Log.d("Test","CoroutineScope START")
            a()
            b()
            Log.d("Test","CoroutineScope END")
        }

        Log.d("Test","END")


    }

        suspend fun a() {

            //a작업은 오래걸려서 2초
            delay(1000)
            Log.d("Test","api1")

            delay(1000)

            Log.d("Test","api2")
        }

        suspend fun b() {

            //b작업도 2초

            delay(1000)
            Log.d("Test","bp1")

            delay(1000)
            Log.d("Test","bp2")
        }
    }
