package com.example.retrofitdemo

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums() : Response<Albums>
}