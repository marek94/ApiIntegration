package com.postapi.example

import com.google.gson.Gson
import com.postapi.example.api.dto.Post
import java.io.File
import javax.inject.Inject

class PostProcessor @Inject constructor(private val jsonConverter: Gson) {

    fun savePostsInFiles(posts: List<Post>, fileExtension: String) = posts.forEach { post ->
        File("${post.id}$fileExtension").also { file ->
            println("Writing post with id: ${post.id} to file: ${file.absolutePath}")
            file.writeText(jsonConverter.toJson(post))
        }
    }
}