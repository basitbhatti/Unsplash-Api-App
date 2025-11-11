package com.android.paging3.di

import android.content.Context
import androidx.room.Room
import com.android.paging3.data.local.database.UnsplashDatabase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object DatabaseModule {

    fun getDatabase(
        @ApplicationContext context: Context
    ): UnsplashDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            UnsplashDatabase::class.java,
            "unsplash_dp"
        ).build()
    }


}