package com.postapi.example;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostProcessor_Factory implements Factory<PostProcessor> {
  private final Provider<Gson> jsonConverterProvider;

  public PostProcessor_Factory(Provider<Gson> jsonConverterProvider) {
    this.jsonConverterProvider = jsonConverterProvider;
  }

  @Override
  public PostProcessor get() {
    return provideInstance(jsonConverterProvider);
  }

  public static PostProcessor provideInstance(Provider<Gson> jsonConverterProvider) {
    return new PostProcessor(jsonConverterProvider.get());
  }

  public static PostProcessor_Factory create(Provider<Gson> jsonConverterProvider) {
    return new PostProcessor_Factory(jsonConverterProvider);
  }

  public static PostProcessor newPostProcessor(Gson jsonConverter) {
    return new PostProcessor(jsonConverter);
  }
}
