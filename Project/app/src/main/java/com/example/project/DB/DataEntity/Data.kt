package com.example.project.DB.DataEntity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//데이터 항목 정의
//테이블 이름, 기본키, 필드 name, id를 정의
@Entity(tableName = "name_table")
data class Data(

    @PrimaryKey val id : Int,
    @ColumnInfo(name = "data")
    var data : String
)
