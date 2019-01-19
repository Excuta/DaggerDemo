package com.excuta.daggerdemo;

import android.app.Activity;
import android.app.Application;

import com.excuta.daggerdemo.di.app.AppComponent;
import com.excuta.daggerdemo.di.app.DaggerAppComponent;
import com.excuta.daggerdemo.di.app.modules.ContextModule;

import timber.log.Timber;

public class DemoApp extends Application {

    private AppComponent appComponent;

    public static DemoApp get(Activity activity){
        return (DemoApp) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        appComponent = DaggerAppComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
