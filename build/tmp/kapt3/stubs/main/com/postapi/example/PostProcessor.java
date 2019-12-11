package com.postapi.example;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/postapi/example/PostProcessor;", "", "jsonConverter", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "savePostsInFiles", "", "posts", "", "Lcom/postapi/example/api/dto/Post;", "fileExtension", "", "ApiIntegrationExample"})
public final class PostProcessor {
    private final com.google.gson.Gson jsonConverter = null;
    
    public final void savePostsInFiles(@org.jetbrains.annotations.NotNull()
    java.util.List<com.postapi.example.api.dto.Post> posts, @org.jetbrains.annotations.NotNull()
    java.lang.String fileExtension) {
    }
    
    @javax.inject.Inject()
    public PostProcessor(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson jsonConverter) {
        super();
    }
}