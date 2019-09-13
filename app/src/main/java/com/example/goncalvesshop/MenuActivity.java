package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private int quantity = 0;
    private double subtotal = 0.00;


    //private TextView idPrice =(TextView) findViewById(R.id.album_price_1).getText().toString();
    //private String printedPrice = idPrice.getText().toString();
    ///private double price = Double.parseDouble(printedPrice);


    private TextView showAddedQuantity;
    private TextView showSubtractedQuantity;
    //private TextView showAddedSubtotal;
    //private TextView showSubtractedSubtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.showAddedQuantity = (TextView) findViewById(R.id.album_quantity_1);
        this.showSubtractedQuantity = (TextView) findViewById(R.id.album_quantity_1);
        //this.showAddedSubtotal = (TextView) findViewById(R.id.album_subtotal_1);
        //this.showSubtractedSubtotal = (TextView) findViewById(R.id.album_subtotal_1);
    }


    public void launchCheckoutActivity(View view) {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        startActivityForResult(checkoutIntent, this.TEXT_REQUEST);
    }


    public void addQuantity(View view)
    {
        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (this.showAddedQuantity != null)
            this.showAddedQuantity.setText(Integer.toString(this.quantity));

    }




    public void subtractQuantity(View view)
    {
        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (this.showSubtractedQuantity != null)
            this.showSubtractedQuantity.setText(Integer.toString(this.quantity));

    }


/*
    public void addSubtotal(View view)
    {

        this.subtotal += this.quantity * this.price;

        if (this.subtotal < 0.00)
        {
            this.subtotal = 0.00;
        }

        if (this.showAddedSubtotal != null)
            this.showAddedSubtotal.setText(Double.toString(this.subtotal));

    }


    public void subtractSubtotal(View view)
    {

        this.subtotal -= this.quantity * this.price;

        if (this.subtotal < 0.00)
        {
            this.subtotal = 0.00;
        }

        if (this.showSubtractedSubtotal != null)
            this.showSubtractedSubtotal.setText(Double.toString(this.subtotal));

    }

*/






}
