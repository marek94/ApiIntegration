package com.postapi.example;

import com.postapi.example.api.PostApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostDownloader_Factory implements Factory<PostDownloader> {
  private final Provider<PostApi> postApiProvider;

  public PostDownloader_Factory(Provider<PostApi> postApiProvider) {
    this.postApiProvider = postApiProvider;
  }

  @Override
  public PostDownloader get() {
    return provideInstance(postApiProvider);
  }

  public static PostDownloader provideInstance(Provider<PostApi> postApiProvider) {
    return new PostDownloader(postApiProvider.get());
  }

  public static PostDownloader_Factory create(Provider<PostApi> postApiProvider) {
    return new PostDownloader_Factory(postApiProvider);
  }

  public static PostDownloader newPostDownloader(PostApi postApi) {
    return new PostDownloader(postApi);
  }
}
