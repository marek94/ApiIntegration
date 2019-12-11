package com.postapi.example.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\"\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/postapi/example/di/ApiModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providePostApi", "Lcom/postapi/example/api/PostApi;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "okHttpClient", "baseUrl", "", "ApiIntegrationExample"})
@dagger.Module()
public final class ApiModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    @Address()
    java.lang.String baseUrl) {
        return null;
    }
    
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides()
    public final com.postapi.example.api.PostApi providePostApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public ApiModule() {
        super();
    }
}