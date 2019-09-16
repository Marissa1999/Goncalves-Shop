package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity
{


    private TextView finalSubtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent menuIntent = getIntent();
        String message = menuIntent.getStringExtra(MenuActivity.EXTRA_MESSAGE);
        this.finalSubtotal = findViewById(R.id.subtotal_number);
        this.finalSubtotal.setText(message);
    }

}
