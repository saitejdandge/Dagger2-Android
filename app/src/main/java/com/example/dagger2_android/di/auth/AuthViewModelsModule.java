package com.example.dagger2_android.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.dagger2_android.auth.AuthViewModel;
import com.example.dagger2_android.di.app.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
