package com.postapi.example.di

import com.google.gson.GsonBuilder
import com.postapi.example.api.PostApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApiModule {

    @Provides
    fun provideOkHttpClient() = OkHttpClient()

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, @Address baseUrl: String) = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    fun provideGson() = GsonBuilder().setPrettyPrinting().create()

    @Provides
    fun providePostApi(retrofit: Retrofit) = retrofit.create(PostApi::class.java)
}