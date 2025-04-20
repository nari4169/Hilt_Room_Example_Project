package com.billcoreatech.health0419.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteDocs(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val content: String
)