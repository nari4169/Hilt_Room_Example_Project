package com.billcoreatech.health0419.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NoteDocsDao {
    @Query("SELECT * FROM notes")
    suspend fun getAll(): List<NoteDocs>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: NoteDocs)

    @Delete
    suspend fun delete(note: NoteDocs)
}