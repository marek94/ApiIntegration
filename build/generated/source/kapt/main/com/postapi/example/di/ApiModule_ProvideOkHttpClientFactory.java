package com.postapi.example.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final ApiModule module;

  public ApiModule_ProvideOkHttpClientFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideInstance(module);
  }

  public static OkHttpClient provideInstance(ApiModule module) {
    return proxyProvideOkHttpClient(module);
  }

  public static ApiModule_ProvideOkHttpClientFactory create(ApiModule module) {
    return new ApiModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient proxyProvideOkHttpClient(ApiModule instance) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
