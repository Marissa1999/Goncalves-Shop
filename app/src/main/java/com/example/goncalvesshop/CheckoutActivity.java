package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity
{

    private TextView finalSubtotal;
    private TextView finalTPSTax;
    private TextView finalTVQTax;
    private TextView finalTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent menuIntent = getIntent();

        String finalAlbumSubtotal = menuIntent.getStringExtra(MenuActivity.FINAL_SUBTOTAL);
        String finalAlbumTPSTax = menuIntent.getStringExtra(MenuActivity.TPS_TAX);
        String finalAlbumTVQTax = menuIntent.getStringExtra(MenuActivity.TVQ_TAX);
        String finalAlbumTotal = menuIntent.getStringExtra(MenuActivity.FINAL_TOTAL);

        this.finalSubtotal = findViewById(R.id.subtotal_number);
        this.finalSubtotal.setText(finalAlbumSubtotal);

        this.finalTPSTax = findViewById(R.id.tps_total_number);
        this.finalTPSTax.setText(finalAlbumTPSTax);

        this.finalTVQTax = findViewById(R.id.tvq_total_number);
        this.finalTVQTax.setText(finalAlbumTVQTax);

        this.finalTotal = findViewById(R.id.final_total_number);
        this.finalTotal.setText(finalAlbumTotal);

    }

}
