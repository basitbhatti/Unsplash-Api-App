package com.android.paging3.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.paging3.data.local.dao.UnsplashImageDao
import com.android.paging3.data.local.dao.UnsplashRemoteKeyDao
import com.android.paging3.model.UnsplashImage
import com.android.paging3.model.UnsplashRemoteKey

@Database(entities = [UnsplashImage::class, UnsplashRemoteKey::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase(){

    abstract fun getUnsplashImageDao () : UnsplashImageDao
    abstract fun getUnsplashRemoteKeys () : UnsplashRemoteKeyDao
}