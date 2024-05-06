package com.example.mvvm_pratice

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.mvvm_pratice.Model.DB
import com.example.mvvm_pratice.Model.DataEntity

class Repositoryim(application: Application ) : Repository{
    private val Dao by lazy {
        DB.getDatabase(application).Number()
    }
    override fun insert(data: DataEntity) {
        Dao.addNumber(data)
    }

    override suspend fun update(data: DataEntity) {
        Dao.update(data)
    }

    override fun getAll(): LiveData<List<DataEntity>> {
        return Dao.getAllRandomNumber()
    }
}