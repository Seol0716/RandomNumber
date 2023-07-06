package com.example.project.Repository

import android.content.Context
import com.example.project.DB.DB
import com.example.project.DB.DataEntity.Data


//Repository

//Room과 상호작용
class Repository(context: Context) {
    val db = DB.getDatabase(context)

    fun insert(name : String) = db.name().insert(Data(0,name))

    fun getAll() = db.name().getAll()

    fun getDelete() = db.name().delete()
    fun getName() = db.name().getName()
}