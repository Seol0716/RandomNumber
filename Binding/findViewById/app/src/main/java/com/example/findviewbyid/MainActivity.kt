package com.example.findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        // findViewById -> 100개
//        val btn1 : Button = findViewById(R.id.btn1)
//        val btn2 : Button = findViewById(R.id.btn2)
//        val btn3 : Button = findViewById(R.id.btn3)
//
//        btn1.text = "abcd"
//        btn2.text = "abcd"
//        btn3.text = "abcd"

        // Kotlin Extensions
        btn1.text = "abcd"
        btn2.text = "abcd"
        btn3.text = "abcd"

        secondBtn.text = "sadfasdfasdf"

    }
}