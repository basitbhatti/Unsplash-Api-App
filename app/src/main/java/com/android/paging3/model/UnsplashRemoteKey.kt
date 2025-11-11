package com.android.paging3.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "unsplash_remote_key_table")
class UnsplashRemoteKey (
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val nextPage: Int?,
    val prevPage: Int?
)