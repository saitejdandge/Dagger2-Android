package com.example.dagger2_android.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.dagger2_android.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";
    private AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        if (authApi != null)
            Log.d(TAG, "AuthViewModel: auth is not null");
        else
            Log.d(TAG, "AuthViewModel: auth is null");
    }
}
