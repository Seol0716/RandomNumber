package com.example.mvvm_pratice.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [DataEntity::class], version = 1)

abstract class DB : RoomDatabase() {

    abstract fun name() : Dao

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