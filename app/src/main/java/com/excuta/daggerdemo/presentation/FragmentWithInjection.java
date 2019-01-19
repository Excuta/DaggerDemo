package com.excuta.daggerdemo.presentation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.excuta.daggerdemo.DemoApp;
import com.excuta.daggerdemo.R;
import com.excuta.daggerdemo.di.fragment.DaggerFragmentComponent;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWithInjection extends Fragment implements InjectedRecyclerViewAdapter.ClickListener {


    @Inject
    InjectedRecyclerViewAdapter adapter;

    /*
    @Inject
    YourServiceClass serviceClass; //injected here or in presenter or viewmodel etc..
    */

    public FragmentWithInjection() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dagger_injection, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inject();
    }

    private void inject() {
        DaggerFragmentComponent.builder()
                .appComponent(DemoApp.get(getActivity()).getAppComponent())
                .build()
                .inject(this);
    }

    @Override
    public void onItemClick() {

    }
}
