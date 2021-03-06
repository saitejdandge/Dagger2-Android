package com.example.dagger2_android.di.app;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger2_android.R;
import com.example.dagger2_android.constants.NetworkConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    static Retrofit provideRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl(NetworkConstants.BASEURL)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Provides
    @Singleton
    static RequestOptions providesRequestOptions() {
        return RequestOptions.placeholderOf(R.drawable.white)
                .error(R.drawable.white);
    }

    @Provides
    @Singleton
    static RequestManager providesRequestManager(Application application, RequestOptions requestOptions) {
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    @Provides
    @Singleton
    static Drawable providesAppDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.mipmap.ic_launcher);
    }
}
