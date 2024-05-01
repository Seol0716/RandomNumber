package com.example.mvvm_pratice.Room

import android.provider.ContactsContract.Data
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao

interface Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(insert : DataEntity)

    //삭제
    //name_table 안에 있는 요소들을 삭제"
    @Query("DELETE FROM name_table")
    fun delete()

    //랜덤뽑기
    //COUNT(*) 전체 행수를 반환
    @Query("SELECT COUNT(*) FROM NAME_TABLE")

    fun getCount() : Int

    //Name_Table에서 전체 행 중 1개의 데이터만 받아온다
    //offset: 시작위치
    //N번째 행의 데이터부터 가져온다
    //Limit: 가져올 데이터의 수
//    @Query("SELECT *" + "FROM NAME_TABLE LIMIT 1 OFFSET :randomIndex")
//    fun getRandomData(randomIndex : Int) : Int

    //ORDER BY RNADOM Roomdb에서 랜덤하게 데이터를 선택하도록 한다
    //랜덤으로 하나의 데이터를 선택해서 반환
    @Query("SELECT * FROM NAME_TABLE ORDER BY RANDOM() LIMIT 1")
    fun getRandomData() : DataEntity?
}