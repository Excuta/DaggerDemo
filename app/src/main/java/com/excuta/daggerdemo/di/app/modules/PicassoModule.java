package com.excuta.daggerdemo.di.app.modules;

import android.content.Context;

import com.excuta.daggerdemo.di.app.AppScope;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module(includes = {ContextModule.class, NetworkClientModule.class})
public class PicassoModule {

    @Provides
    @AppScope
    public Downloader downloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }

    @Provides
    @AppScope
    public Picasso picasso(Context context, Downloader downloader) {
        return new Picasso.Builder(context)
                .downloader(downloader)
                .build();
    }
}
