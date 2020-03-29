package com.example.dagger2_android.di.app;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger2_android.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}
