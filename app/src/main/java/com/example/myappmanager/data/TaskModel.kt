package com.example.myappmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "taskmodel")
data class TaskModel(
@PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var time: Long? = null,

):Serializable


