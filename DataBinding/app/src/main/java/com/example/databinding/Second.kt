package com.example.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        val transaction = manager.beginTransaction()
        val fragment = Test_fragment()

        transaction.replace(R.id.fragment,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}