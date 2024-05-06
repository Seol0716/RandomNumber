package com.example.mvvm_pratice.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Number")
data class DataEntity(

    //기본키값 자동으로 설정
    @PrimaryKey(autoGenerate = true)
    //고유번호
    //당첨자 번호
    val number: Int
)