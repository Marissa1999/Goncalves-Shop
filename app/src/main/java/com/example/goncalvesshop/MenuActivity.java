package com.example.goncalvesshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private int quantity = 0;
    private double subtotal = 0.0;


    private TextView idPrice = findViewById(R.id.album_price);
    private String printedPrice = idPrice.getText().toString();
    private double price = Double.parseDouble(printedPrice);


    private TextView showAddedQuantity;
    private TextView showSubtractedQuantity;
    private TextView showAddedSubtotal;
    private TextView showSubtractedSubtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.showAddedQuantity = findViewById(R.id.album_quantity);
        this.showSubtractedQuantity = findViewById(R.id.album_quantity);
        this.showAddedSubtotal = findViewById(R.id.album_subtotal);
        this.showSubtractedSubtotal = findViewById(R.id.album_subtotal);
    }


    public void launchCheckoutActivity(View view) {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        checkoutIntent.putExtra("Total Amount Before Taxes: ", String.valueOf(this.price));
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
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



    public void addSubtotal(View view)
    {

        this.subtotal += this.quantity * this.price;

        if (this.subtotal < 0.0)
        {
            this.subtotal = 0.0;
        }

        if (this.showAddedSubtotal != null)
            this.showAddedSubtotal.setText(Double.toString(this.subtotal));

    }


    public void subtractSubtotal(View view)
    {

        this.subtotal -= this.quantity * this.price;

        if (this.subtotal < 0.0)
        {
            this.subtotal = 0.0;
        }

        if (this.showSubtractedSubtotal != null)
            this.showSubtractedSubtotal.setText(Double.toString(this.subtotal));

    }


    public void finalSubtotal(View view)
    {




    }

}
