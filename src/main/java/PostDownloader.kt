package com.postapi.example
import com.postapi.example.api.PostApi
import com.postapi.example.api.dto.Post
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import javax.inject.Inject

class PostDownloader @Inject constructor(private val postApi: PostApi) {

    fun download(): List<Post> {
        var posts = listOf<Post>()
        try {
            val response = postApi.getPosts().execute()
            if (response.isSuccessful) {
                response.body()?.let { posts = it }
            } else {
                val error = response.errorBody()
                println("Problem occurred: \n$error")
            }
        } catch (exception: Exception) {
            when (exception) {
                is SocketTimeoutException, is ConnectException, is UnknownHostException -> println("Problem with connection. Try again.")
                else -> println("Problem occured. Try again.")
            }
        }
        return posts
    }
}