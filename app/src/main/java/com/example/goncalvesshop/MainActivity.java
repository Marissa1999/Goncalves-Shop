package com.example.goncalvesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String MAIN_LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MAIN_LOG_TAG, "Started MainActivity");
    }

    public void launchMenuActivity(View view) {
        Intent menuIntent = new Intent(this, MenuActivity.class);
        startActivityForResult(menuIntent, TEXT_REQUEST);

        Log.d(MAIN_LOG_TAG, "Launched the MenuActivity with Clicked Button");
    }


}
