import com.postapi.example.di.DaggerApplicationComponent

/**
 * Created by Marek on 11.12.2019.
 */

const val FILE_EXTENSION = ".json"
const val BASE_URL = "http://jsonplaceholder.typicode.com/"

fun main() {

    println("Program is starting...")
    val applicationComponent = DaggerApplicationComponent.builder().baseUrl(BASE_URL).build()
    val postsDownloader = applicationComponent.postDownloader()

    println("Downloading posts from $BASE_URL...")
    val posts = postsDownloader.download()

    println("Posts were downloaded successfully.")
    val postProcessor = applicationComponent.postProcessor()

    println("Saving posts into files...")
    postProcessor.savePostsInFiles(posts, FILE_EXTENSION)
}