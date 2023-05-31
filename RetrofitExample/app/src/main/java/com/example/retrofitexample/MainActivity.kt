package com.example.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitexample.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.getPost1()
        viewModel.getPostNumber(3)

        val text1 = findViewById<TextView>(R.id.test1)

        val text2 = findViewById<TextView>(R.id.test2)

        viewModel.liveword1.observe(this, Observer {
            text1.text = it.toString()
        })

        viewModel.liveword2.observe(this, Observer {
            text2.text = it.toString()
        })
    }
}