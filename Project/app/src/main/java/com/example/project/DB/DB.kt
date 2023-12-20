package com.example.project.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.project.Dao.NameDao
import com.example.project.DB.DataEntity.Data


//Room db와 연결
//데이터 베이스 구성을 정의하고 데이터 액세스 접근하기 위한 역할을 한다
//조건 
//1. @Database 키워드를 선언하고 entity 클래스를 정의해야한다
//2. RoomDatabase 추상 클래스 선언
//3. Dao 클래스에서 DB 클래스 인수가 0개여야 하고
// Dao 클래스의 인스턴스를 반환하는 추상 메서드를 정의해야한다

@Database(entities = [Data::class], version = 1)

abstract class DB : RoomDatabase() {

    abstract fun name() : NameDao

    companion object {
        @Volatile
        private var INSTANCE : DB? = null

        fun getDatabase(
            context : Context
        ) : DB {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DB::class.java,
                    "text_db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }

    }

}
