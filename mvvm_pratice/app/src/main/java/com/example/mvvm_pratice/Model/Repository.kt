package com.example.mvvm_pratice.Model

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.mvvm_pratice.Room.DB
import com.example.mvvm_pratice.Room.Dao
import com.example.mvvm_pratice.Room.DataEntity

//Dao 클래스와 상호작용하여
//Room db와 데이터 전달 받음

    //Room과 상호작용
    class Repository(private val dao : Dao) {


        fun insert(name : String) = dao.insert(DataEntity(0,name))
        fun getDelete() = dao.delete()

        fun getNameById(id : Long) : LiveData<String> {
            return dao.getNameById(id)
        }

        fun getRandomId() : Long {
            return dao.getRandomId()
        }
    }
