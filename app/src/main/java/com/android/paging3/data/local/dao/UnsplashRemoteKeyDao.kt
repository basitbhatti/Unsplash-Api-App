package com.android.paging3.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.android.paging3.model.UnsplashRemoteKey

@Dao
interface UnsplashRemoteKeyDao {

    @Query("SELECT * FROM unsplash_remote_key_table WHERE id =:id")
    fun getRemoteKeys(id: String): UnsplashRemoteKey

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addRemoteKey(remoteKeys : List<UnsplashRemoteKey>)

    @Query("DELETE FROM unsplash_remote_key_table")
    fun deleteRemoteKeys()

}