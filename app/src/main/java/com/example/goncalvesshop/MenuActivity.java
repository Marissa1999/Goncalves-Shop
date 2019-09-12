package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity
{

    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }
}
