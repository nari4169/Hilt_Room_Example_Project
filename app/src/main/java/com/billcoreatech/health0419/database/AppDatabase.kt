package com.billcoreatech.health0419.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteDocs::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDocsDao
}