package com.example.mvvm.Repository

import android.app.Application
import android.content.Context
import com.example.mvvm.DB.DB
import com.example.mvvm.DataEntity.Data

//Repository

//Room과 상호작용
class Repository(context: Context) {
    val db = DB.getDatabase(context)

    fun insert(name : String) = db.name().insert(Data(0,name))

    fun delete() = db.name().delete()

 }