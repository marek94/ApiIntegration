package com.postapi.example.di;

import com.postapi.example.PostDownloader;
import com.postapi.example.PostProcessor;
import com.postapi.example.api.PostApi;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private ApiModule apiModule;

  private String baseUrl;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static ApplicationComponent.Builder builder() {
    return new Builder();
  }

  private Retrofit getRetrofit() {
    return ApiModule_ProvideRetrofitFactory.proxyProvideRetrofit(
        apiModule,
        ApiModule_ProvideOkHttpClientFactory.proxyProvideOkHttpClient(apiModule),
        baseUrl);
  }

  private PostApi getPostApi() {
    return ApiModule_ProvidePostApiFactory.proxyProvidePostApi(apiModule, getRetrofit());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.apiModule = builder.apiModule;
    this.baseUrl = builder.baseUrl;
  }

  @Override
  public PostDownloader postDownloader() {
    return new PostDownloader(getPostApi());
  }

  @Override
  public PostProcessor postProcessor() {
    return new PostProcessor(ApiModule_ProvideGsonFactory.proxyProvideGson(apiModule));
  }

  private static final class Builder implements ApplicationComponent.Builder {
    private ApiModule apiModule;

    private String baseUrl;

    @Override
    public ApplicationComponent build() {
      if (apiModule == null) {
        this.apiModule = new ApiModule();
      }
      if (baseUrl == null) {
        throw new IllegalStateException(String.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    @Override
    public Builder baseUrl(String baseUrl) {
      this.baseUrl = Preconditions.checkNotNull(baseUrl);
      return this;
    }
  }
}
