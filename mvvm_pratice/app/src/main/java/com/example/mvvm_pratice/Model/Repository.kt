package com.example.mvvm_pratice.Model

import android.content.Context
import com.example.mvvm_pratice.Room.DB
import com.example.mvvm_pratice.Room.DataEntity

//Dao 클래스와 상호작용하여
//Room db와 데이터 전달 받음

    //Room과 상호작용
    class Repository(context: Context) {
        val db = DB.getDatabase(context)

        fun insert(name : String) = db.name().insert(DataEntity(0,name))
        fun getDelete() = db.name().delete()

        fun getRandomCount(RandomIndex : Int) : Int {

            return db.name().getRandomData(RandomIndex)
        }

        fun getCount() : Int = db.name().getCount()
    }
