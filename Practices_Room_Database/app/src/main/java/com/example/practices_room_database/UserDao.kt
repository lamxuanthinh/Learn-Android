package com.example.practices_room_database

import androidx.room.*

@Dao
interface UserDao {

    fun getAll(): List<User>

    @Insert
    fun insert(user: User)

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}