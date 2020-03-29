package com.example.dagger2_android.di.app;

import com.example.dagger2_android.auth.AuthActivity;
import com.example.dagger2_android.di.auth.AuthViewModelsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class})
    abstract AuthActivity contributesAuthActivity();
}
