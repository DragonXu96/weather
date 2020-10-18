package com.dragonxu.weather;

import android.app.Application;

import org.litepal.LitePal;

public class MyOwnApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
