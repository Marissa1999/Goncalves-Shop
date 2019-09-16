package com.example.goncalvesshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {


    private static final String LOG_TAG = MenuActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private int quantity = 0;


    private TextView showAddedAlbumQuantity_1;
    private TextView showAddedAlbumQuantity_2;
    private TextView showAddedAlbumQuantity_3;
    private TextView showAddedAlbumQuantity_4;
    private TextView showAddedAlbumQuantity_5;
    private TextView showAddedAlbumQuantity_6;
    private TextView showAddedAlbumQuantity_7;
    private TextView showAddedAlbumQuantity_8;
    private TextView showAddedAlbumQuantity_9;
    private TextView showAddedAlbumQuantity_10;


    private TextView showSubtractedAlbumQuantity_1;
    private TextView showSubtractedAlbumQuantity_2;
    private TextView showSubtractedAlbumQuantity_3;
    private TextView showSubtractedAlbumQuantity_4;
    private TextView showSubtractedAlbumQuantity_5;
    private TextView showSubtractedAlbumQuantity_6;
    private TextView showSubtractedAlbumQuantity_7;
    private TextView showSubtractedAlbumQuantity_8;
    private TextView showSubtractedAlbumQuantity_9;
    private TextView showSubtractedAlbumQuantity_10;


    private TextView albumSubtotal_1 = findViewById(R.id.album_subtotal_1);
    private TextView albumSubtotal_2 = findViewById(R.id.album_subtotal_2);
    private TextView albumSubtotal_3 = findViewById(R.id.album_subtotal_3);
    private TextView albumSubtotal_4 = findViewById(R.id.album_subtotal_4);
    private TextView albumSubtotal_5 = findViewById(R.id.album_subtotal_5);
    private TextView albumSubtotal_6 = findViewById(R.id.album_subtotal_6);



    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.showAddedAlbumQuantity_1 = findViewById(R.id.album_quantity_1);
        this.showSubtractedAlbumQuantity_1 = findViewById(R.id.album_quantity_1);

    }



    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity1(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_1 != null)
            showAddedAlbumQuantity_1.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity1(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_1 != null)
            showSubtractedAlbumQuantity_1.setText(Integer.toString(this.quantity));

    }





/*
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

        if (this.subtotal < 0)
        {
            this.subtotal = 0;
        }

        if (this.showAddedSubtotal != null)
            this.showAddedSubtotal.setText(Double.toString(this.subtotal));

    }


    public void subtractSubtotal(View view)
    {

        this.subtotal -= this.quantity * this.price;

        if (this.subtotal < 0)
        {
            this.subtotal = 0;
        }

        if (this.showSubtractedSubtotal != null)
            this.showSubtractedSubtotal.setText(Double.toString(this.subtotal));

    }


}


    public void modifyAlbumQuantity(View view)
    {

        String stringAlbumQuantity = albumQuantity.getText().toString();
        int integerAlbumQuantity = Integer.parseInt(stringAlbumQuantity);


        if (view.getId() == addingButton.getId())
        {
            integerAlbumQuantity++;

            if (integerAlbumQuantity < 0)
            {
                integerAlbumQuantity = 0;
            }

            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal_1);
        }

        else if (view.getId() == minusButton.getId())
        {
            integerAlbumQuantity--;

            if (integerAlbumQuantity < 0)
            {
                integerAlbumQuantity = 0;
            }

            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal_1);
        }

    }

    private void showAlbumSubtotal(int integerAlbumQuantity, TextView albumPrice, TextView albumSubtotal)
    {
        String initialStringAlbumPrice = albumPrice.getText().toString();
        String stringAlbumPrice = initialStringAlbumPrice.substring(1);
        double newAlbumPrice = Double.parseDouble(stringAlbumPrice);
        double newAlbumSubtotal = newAlbumPrice * integerAlbumQuantity;
        albumSubtotal.setText(String.format("$%s", newAlbumSubtotal));
    }



*/


    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }

}


