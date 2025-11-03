package com.android.paging3.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class User (
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val name: String
)