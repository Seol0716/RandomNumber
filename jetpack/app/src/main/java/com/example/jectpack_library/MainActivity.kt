package com.example.jectpack_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//findVeiwById
//kotlin Extensions
//뷰의 null의 이슈
//성능이슈
//ViewBinding
//Data Binding





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //findViewById -> 100개
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)

        btn1.text = "abcd"
        btn2.text = "abcd"
        btn3.text = "abcd"
        */


    }
}