package com.excuta.daggerdemo.di.app.modules;

import android.content.Context;

import com.excuta.daggerdemo.di.app.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context appContext;

    public ContextModule(Context appContext) {
        this.appContext = appContext;
    }

    @AppScope
    @Provides
    Context appContext() {
        return appContext;
    }
}
