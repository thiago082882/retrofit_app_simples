package com.thiago.retrofitapp.service

import com.thiago.retrofitapp.model.AlbumItem
import com.thiago.retrofitapp.model.Albums
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumService {

    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>

    @GET("/albums")
    suspend fun  getSpecificAlbums(@Query("userId")userId : Int) : Response<Albums>
}