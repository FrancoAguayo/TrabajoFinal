package com.example.trabajofinal

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

interface ApiService {
    @GET("photos/{id}")
    fun getPostById(@Path("id")id :Int): Call<Post>
}