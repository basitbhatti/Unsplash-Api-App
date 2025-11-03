package com.android.paging3.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity("unsplash_image_table")
@Serializable
data class UnsplashImage (
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val likes: Int,
    @Embedded
    val user: User,
    @Embedded
    val urls: Urls

)