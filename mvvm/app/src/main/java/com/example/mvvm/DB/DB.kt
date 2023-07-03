package com.example.mvvm.DB

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvm.Dao.NameDao
import com.example.mvvm.DataEntity.Data

//연결된 데이터 항목을 모두 나열하는 entity 클래스도 배열에 포함
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