package com.example.project.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.project.DB.DataEntity.Data
import java.util.concurrent.Flow


//편의 메서드 추가 삭제
//쿼리 메서드 조회
//테이블 데이터와 상호작용

@Dao
interface NameDao {

    //추가
    //OnConflictStrategy 충돌 방지 처리
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(insert : Data)

    //삭제
    //name_table 안에 있는 요소들을 삭제"
    @Query("DELETE FROM name_table")
    fun delete()


    //조회
    @Query("SELECT * FROM name_table")
    fun getAll() : List<Data>

    //name 컬럼 데이터 불러오기
    @Query("SELECT * FROM NAME_TABLE WHERE data")
    fun getName() : List<Data>

}