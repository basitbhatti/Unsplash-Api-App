package com.android.paging3.data.remote

import com.android.paging3.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {


    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ) : List<UnsplashApi>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int,
    ) : List<UnsplashApi>


}