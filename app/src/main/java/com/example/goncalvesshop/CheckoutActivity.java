package com.example.goncalvesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    private static final String CHECKOUT_LOG_TAG = CheckoutActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent menuIntent = getIntent();

        String finalAlbumSubtotal = menuIntent.getStringExtra(MenuActivity.FINAL_SUBTOTAL);
        String finalAlbumTPSTax = menuIntent.getStringExtra(MenuActivity.TPS_TAX);
        String finalAlbumTVQTax = menuIntent.getStringExtra(MenuActivity.TVQ_TAX);
        String finalAlbumTotal = menuIntent.getStringExtra(MenuActivity.FINAL_TOTAL);

        TextView finalSubtotal = findViewById(R.id.subtotal_number);
        finalSubtotal.setText(finalAlbumSubtotal);

        TextView finalTPSTax = findViewById(R.id.tps_total_number);
        finalTPSTax.setText(finalAlbumTPSTax);

        TextView finalTVQTax = findViewById(R.id.tvq_total_number);
        finalTVQTax.setText(finalAlbumTVQTax);

        TextView finalTotal = findViewById(R.id.final_total_number);
        finalTotal.setText(finalAlbumTotal);

        Log.d(CHECKOUT_LOG_TAG, "Started CheckoutActivity and Transferred Values from MenuActivity");

    }

}
