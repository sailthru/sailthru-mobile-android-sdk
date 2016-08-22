package com.carnivalmobile.example;

import android.app.Application;

import com.carnival.sdk.Carnival;
import com.carnival.sdk.NotificationConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NotificationConfig config = new NotificationConfig();
        config.setSmallIcon(R.mipmap.ic_launcher);

        Carnival.setNotificationConfig(config);
        Carnival.startEngine(this, "37d2197e847a3cd61921bed16f8ffdd1119cbb94");
    }
}
