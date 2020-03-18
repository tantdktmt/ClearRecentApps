package com.example.alticast.clearrecentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent ("com.android.systemui.recent.action.TOGGLE_RECENTS");
        intent.setComponent (new ComponentName("com.android.systemui", "com.android.systemui.recent.RecentsActivity"));
        startActivity (intent);
    }
}
