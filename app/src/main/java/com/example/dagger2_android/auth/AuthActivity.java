package com.example.dagger2_android.auth;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.RequestManager;
import com.example.dagger2_android.R;
import com.example.dagger2_android.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    @Inject
    public Drawable image;

    @Inject
    public ViewModelProviderFactory viewModelProviderFactory;

    private AuthViewModel authViewModel;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        loadImage();
        authViewModel = new ViewModelProvider(this, viewModelProviderFactory).get(AuthViewModel.class);
    }

    public void loadImage() {
        requestManager.load(image).into((ImageView) findViewById(R.id.image));
    }


}
