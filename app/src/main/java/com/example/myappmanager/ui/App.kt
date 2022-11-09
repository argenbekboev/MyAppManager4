package com.example.myappmanager.ui

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.myappmanager.room.DataBase

class App: Application() {


    companion object{
        lateinit var database: DataBase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,DataBase::class.java,"database")
            .allowMainThreadQueries()
            .build()
    }

    fun getDatabase(): DataBase {
        return database
    }
}