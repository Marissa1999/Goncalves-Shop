package com.example.goncalvesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //The tag to call the MainActivity class name when debugging code
    private static final String MAIN_LOG_TAG = MainActivity.class.getSimpleName();

    //The tag to send a request to the MenuActivity class when it is launched
    public static final int TEXT_REQUEST = 1;


    //Start the MainActivity class with this auto-implemented method
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Launch the MainActivity class and display the design on the screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Print a log message to ensure onCreate method's functionality
        Log.d(MAIN_LOG_TAG, "Started MainActivity");
    }

    //Launch the MenuActivity class, which is supposed to be the following activity
    public void launchMenuActivity(View view) {

        //Create an intent to start the following activity, which is MenuActivity class
        Intent menuIntent = new Intent(this, MenuActivity.class);

        //Start the MenuActivity class and send a text request at the same time
        startActivityForResult(menuIntent, TEXT_REQUEST);

        //Print a log message to ensure launchMenuActivity method's functionality
        Log.d(MAIN_LOG_TAG, "Launched the MenuActivity with Clicked Button");
    }


}
