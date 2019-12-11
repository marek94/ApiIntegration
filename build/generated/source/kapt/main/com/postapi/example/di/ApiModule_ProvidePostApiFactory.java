package com.postapi.example.di;

import com.postapi.example.api.PostApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvidePostApiFactory implements Factory<PostApi> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvidePostApiFactory(ApiModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PostApi get() {
    return provideInstance(module, retrofitProvider);
  }

  public static PostApi provideInstance(ApiModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvidePostApi(module, retrofitProvider.get());
  }

  public static ApiModule_ProvidePostApiFactory create(
      ApiModule module, Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvidePostApiFactory(module, retrofitProvider);
  }

  public static PostApi proxyProvidePostApi(ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.providePostApi(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
