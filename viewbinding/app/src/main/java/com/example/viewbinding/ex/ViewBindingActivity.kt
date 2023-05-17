package com.example.viewbinding.ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.viewbinding.R
import com.example.viewbinding.databinding.ActivityMainBinding
import com.example.viewbinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityViewBindingBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val array = ArrayList<String>()

        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")
        array.add("a")

        val customViewadapter = CustomViewadapter(array)

        val rv = binding.rv

        rv.adapter = customViewadapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}