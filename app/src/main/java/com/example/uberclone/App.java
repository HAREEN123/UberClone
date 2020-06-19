package com.example.uberclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nnfQViZvQ5Jalkq7oSSbYcenQ5NcFsFSTqA8WVG2")
                // if defined
                .clientKey("7AmfxYzObB3tgycyHbsXcPPUC1YUhecl10G5Ri5x")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
