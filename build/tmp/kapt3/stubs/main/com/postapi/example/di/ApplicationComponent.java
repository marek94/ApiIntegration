package com.postapi.example.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/postapi/example/di/ApplicationComponent;", "", "postDownloader", "Lcom/postapi/example/PostDownloader;", "postProcessor", "Lcom/postapi/example/PostProcessor;", "Builder", "ApiIntegrationExample"})
@dagger.Component(modules = {com.postapi.example.di.ApiModule.class})
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.postapi.example.PostDownloader postDownloader();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.postapi.example.PostProcessor postProcessor();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/postapi/example/di/ApplicationComponent$Builder;", "", "baseUrl", "", "build", "Lcom/postapi/example/di/ApplicationComponent;", "ApiIntegrationExample"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.postapi.example.di.ApplicationComponent.Builder baseUrl(@org.jetbrains.annotations.NotNull()
        @Address()
        java.lang.String baseUrl);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.postapi.example.di.ApplicationComponent build();
    }
}