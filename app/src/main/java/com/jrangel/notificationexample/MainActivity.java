package com.jrangel.notificationexample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Tutorial
 * https://developer.android.com/training/notify-user/build-notification
 * https://openwebinars.net/blog/como-hacer-notificaciones-push-en-android-facil/
 */

public class MainActivity extends AppCompatActivity {

    NotificationCreator notificationCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationCreator = new NotificationCreator(this);
    }

    public void createNotification(View v){
        notificationCreator.createNotification(this, "Notification Created", "Hi, I'm a notification. I love you \uD83D\uDE18");
    }
}