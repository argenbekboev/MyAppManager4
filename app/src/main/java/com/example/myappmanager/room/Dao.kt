package com.example.myappmanager.room

import androidx.room.*
import androidx.room.Dao
import com.example.myappmanager.data.TaskModel

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)

    fun insert(taskModel: TaskModel)

    @Delete
    fun delete(taskModel: TaskModel)

    @Query("SELECT * FROM taskmodel")
    fun getAllNotes(): List<TaskModel>
}