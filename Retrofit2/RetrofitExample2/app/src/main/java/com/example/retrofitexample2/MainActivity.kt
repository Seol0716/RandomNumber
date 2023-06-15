package com.example.retrofitexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitexample2.Adapter.Custm_adapter
import com.example.retrofitexample2.model.Post
import com.example.retrofitexample2.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private  lateinit var button : Button
    private lateinit var edit : EditText
    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getPostAll()

        val rv = findViewById<RecyclerView>(R.id.rv)

        viewModel.All_data_livedata.observe(this, Observer {
            val custmAdapter = Custm_adapter(it as ArrayList<Post>)
            rv.adapter = custmAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
    }
}