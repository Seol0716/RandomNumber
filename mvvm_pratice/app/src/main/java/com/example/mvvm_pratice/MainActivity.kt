package com.example.mvvm_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_pratice.Model.DataEntity
import com.example.mvvm_pratice.ViewModel.MainViewModel
import com.example.mvvm_pratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : Adapter
    private var arr : ArrayList<DataEntity> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        viewModel.randomNumber.observe(this){
            binding.winText.text = it.toString()
            arr.add(DataEntity(it.toInt()))
            adapter = Adapter(arr)
            recyclerView.adapter = adapter
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

        recyclerView = binding.recycler
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}