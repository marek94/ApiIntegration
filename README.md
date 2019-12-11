# ApiIntegration using Kotlin, Retrofit, Gson and Dagger2
This repository show how to download data from remote source using Retrofit(https://square.github.io/retrofit/), Gson serialization/deserialization library (https://github.com/google/gson)
and Dagger2(https://dagger.dev/) to dependency injection.

In this example we download the data from https://jsonplaceholder.typicode.com/post, map it to objects and save to files based on id.

## Description of the program

The **Main.kt** file is an entry point to our program. It consist of:

- URL to download data from and output files' extension.
```javascript
const val FILE_EXTENSION = ".json"
const val BASE_URL = "http://jsonplaceholder.typicode.com/"
```
- Inicialization of Dagger:
```javascript
val applicationComponent = DaggerApplicationComponent.builder().baseUrl(BASE_URL).build()
```

- Delagation of downloading files to PostDownloader and saving to PostProcessor
```javascript
val posts = postsDownloader.download()
postProcessor.savePostsInFiles(posts, FILE_EXTENSION)
```
