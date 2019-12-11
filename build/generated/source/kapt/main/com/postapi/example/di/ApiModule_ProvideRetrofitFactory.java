package com.postapi.example.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseUrlProvider;

  public ApiModule_ProvideRetrofitFactory(
      ApiModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(module, okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit provideInstance(
      ApiModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    return proxyProvideRetrofit(module, okHttpClientProvider.get(), baseUrlProvider.get());
  }

  public static ApiModule_ProvideRetrofitFactory create(
      ApiModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseUrlProvider) {
    return new ApiModule_ProvideRetrofitFactory(module, okHttpClientProvider, baseUrlProvider);
  }

  public static Retrofit proxyProvideRetrofit(
      ApiModule instance, OkHttpClient okHttpClient, String baseUrl) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(okHttpClient, baseUrl),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
