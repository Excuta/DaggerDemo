package com.excuta.daggerdemo.di.fragment;

import com.excuta.daggerdemo.di.app.AppComponent;
import com.excuta.daggerdemo.presentation.FragmentWithInjection;

import dagger.Component;


@FragmentScope
@Component(dependencies = AppComponent.class, modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(FragmentWithInjection fragmentWithInjection);
}
