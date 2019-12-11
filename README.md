# REST API integration using Kotlin, Retrofit, Gson and Dagger2 
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
**Dagger** is configured in the **di** package. Base configuration files are:
- ApplicationComponent
```javascript
@Component(modules = [ApiModule::class])
interface ApplicationComponent {
    fun postDownloader(): PostDownloader
    
    fun postProcessor(): PostProcessor
    
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun baseUrl(@Address baseUrl: String): Builder

        fun build(): ApplicationComponent
    }
}
```
Functions postDownloader and postProcessor supply instances of PostDownloader and PostProcessor. @Component.Builder is used to pass REST API URL and build the Component.
- ApiModule
```javascript
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
```
This file contains objects which Dagger uses to provide dependencies.
