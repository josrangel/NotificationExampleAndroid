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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNotification(View v){
        NotificationCreator notificationCreator = new NotificationCreator(this);
        notificationCreator.createNotification(this, "Notification Created", "Hi, I'm a notification. I love you \uD83D\uDE18");
    }
}