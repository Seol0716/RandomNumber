package com.example.viewbinding

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class Second_Activity  : AppCompatActivity() {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sec_layout)

        val transaction = manager.beginTransaction()
        val fragmetn = Second_Fragment()
        transaction.replace(R.id.frame,fragmetn)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}