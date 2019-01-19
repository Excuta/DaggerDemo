package com.excuta.daggerdemo.di.fragment;

import com.excuta.daggerdemo.presentation.FragmentWithInjection;
import com.excuta.daggerdemo.presentation.InjectedRecyclerViewAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    private FragmentWithInjection fragmentWithInjection;

    public FragmentModule(FragmentWithInjection fragmentWithInjection) {
        this.fragmentWithInjection = fragmentWithInjection;
    }

    @FragmentScope
    @Provides
    InjectedRecyclerViewAdapter.ClickListener clickListener(){
        return fragmentWithInjection;
    }
}
