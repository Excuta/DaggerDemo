package com.excuta.daggerdemo.di.app;

import com.excuta.daggerdemo.di.app.modules.PicassoModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@AppScope
@Component(modules = {PicassoModule.class,
//YourServiceModule.class,
})
public interface AppComponent {

    Picasso picasso();

    //YourServiceClass yourServiceClass();
}
