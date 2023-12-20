package com.example.project.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.project.Dao.NameDao
import com.example.project.DB.DataEntity.Data


//Room db와 연결
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
