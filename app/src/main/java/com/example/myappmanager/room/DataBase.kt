package com.example.myappmanager.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myappmanager.data.TaskModel

@Database(entities = [TaskModel::class], version = 1)
abstract class DataBase: RoomDatabase() {
    abstract fun TaskModel(): Dao
}