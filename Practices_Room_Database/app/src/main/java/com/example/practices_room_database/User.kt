package com.example.practices_room_database


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    var name: String,
    var email: String
)