package com.excuta.daggerdemo.di.app.modules;

import com.excuta.daggerdemo.di.app.AppScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = NetworkClientModule.class)
public class RetrofitModule {

    @AppScope
    @Provides
    Retrofit retrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("") // add your base url
                .build();
    }
}
