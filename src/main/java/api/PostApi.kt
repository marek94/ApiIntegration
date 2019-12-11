package com.postapi.example.api

import com.postapi.example.api.dto.Post
import retrofit2.Call
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}