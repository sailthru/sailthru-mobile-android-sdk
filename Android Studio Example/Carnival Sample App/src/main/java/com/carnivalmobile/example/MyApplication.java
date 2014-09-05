package com.carnivalmobile.example;

import android.app.Application;

import com.carnival.sdk.Carnival;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Carnival.startEngine(this, "<Google Project Number>", "<Carnival App Key>");

    }

}
