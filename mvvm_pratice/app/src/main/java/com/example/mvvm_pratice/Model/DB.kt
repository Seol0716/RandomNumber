package com.example.mvvm_pratice.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//추상화 클래스를 지정하면서 다른 클래스에서 재정의 하기위해

//엔티티 클래스 지정, 데이터베이스 버전 지정, 스키마 내보낼지 여부 결정(비활성화)
@Database(entities = [DataEntity::class], version = 1, exportSchema = false)
abstract class DB : RoomDatabase(){

    abstract fun Number() : Dao


    //싱글톤 패턴으로 관리
    companion object {

        @Volatile
        private var INSTANCE : DB? = null

        //db 생성
        fun getDatabase(
            context : Context
        ) : DB {

            //synchronized 여러 db인스턴스가 만들어지지 않게 관리
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DB::class.java,
                "number_db"
                )

                        //db버전이 변경될때 기존 데이터가 손실방지
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}