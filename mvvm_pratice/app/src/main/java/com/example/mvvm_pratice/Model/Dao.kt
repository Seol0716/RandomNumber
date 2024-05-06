package com.example.mvvm_pratice.Model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface Dao {

    //DB저장
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
     fun addNumber(dataEntity: DataEntity)

    @Update
    suspend fun update(dataEntity: DataEntity)

    //리스트로 보여줄
    @Query("SELECT * FROM Number")
    fun getAllRandomNumber() : LiveData<List<DataEntity>>

}