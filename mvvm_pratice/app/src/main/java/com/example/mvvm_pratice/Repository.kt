package com.example.mvvm_pratice

import androidx.lifecycle.LiveData
import com.example.mvvm_pratice.Model.DataEntity

interface Repository {

     fun insert(data: DataEntity)

    suspend fun update(data : DataEntity)

    fun getAll() : LiveData<List<DataEntity>>
}