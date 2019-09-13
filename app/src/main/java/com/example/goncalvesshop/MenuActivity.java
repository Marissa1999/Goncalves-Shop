package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity
{

    public static final int TEXT_REQUEST = 1;
    private int addedQuantity = 0;
    private int subtractedQuantity = 0;
    private TextView showAddedQuantity;
    private TextView showSubtractedQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        showAddedQuantity = (TextView) findViewById(R.id.album_quantity_1);
        showSubtractedQuantity = (TextView) findViewById(R.id.album_quantity_1);
    }


    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }


    public void addQuantity(View view)
    {
        addedQuantity++;
        if (showAddedQuantity != null)
            showAddedQuantity.setText(Integer.toString(addedQuantity));

    }


    public void subtractQuantity(View view)
    {
        subtractedQuantity--;
        if (showSubtractedQuantity != null)
            showSubtractedQuantity.setText(Integer.toString(subtractedQuantity));

    }

}
