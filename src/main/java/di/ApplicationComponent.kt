package com.postapi.example.di

import com.postapi.example.PostDownloader
import com.postapi.example.PostProcessor
import dagger.BindsInstance
import dagger.Component

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