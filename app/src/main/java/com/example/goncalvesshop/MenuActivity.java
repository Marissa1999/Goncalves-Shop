package com.example.goncalvesshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {


    private static final String LOG_TAG = MenuActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE = "com.example.android.goncalvesshop.extra.MESSAGE";
    public static final int TEXT_REQUEST = 1;
    private int albumQuantity = 0;
    private int quantity = 0;
    private double finalSubtotal = 0.00;

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

    private TextView albumPrice_1;
    private TextView albumPrice_2;
    private TextView albumPrice_3;
    private TextView albumPrice_4;
    private TextView albumPrice_5;
    private TextView albumPrice_6;
    private TextView albumPrice_7;
    private TextView albumPrice_8;
    private TextView albumPrice_9;
    private TextView albumPrice_10;

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


    private TextView showAlbumSubtotal_1;
    private TextView showAlbumSubtotal_2;
    private TextView showAlbumSubtotal_3;
    private TextView showAlbumSubtotal_4;
    private TextView showAlbumSubtotal_5;
    private TextView showAlbumSubtotal_6;
    private TextView showAlbumSubtotal_7;
    private TextView showAlbumSubtotal_8;
    private TextView showAlbumSubtotal_9;
    private TextView showAlbumSubtotal_10;




    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.showAddedAlbumQuantity_1 = findViewById(R.id.album_quantity_1);
        this.showSubtractedAlbumQuantity_1 = findViewById(R.id.album_quantity_1);
        this.showAlbumSubtotal_1 = findViewById(R.id.album_subtotal_1);

        this.showAddedAlbumQuantity_2 = findViewById(R.id.album_quantity_2);
        this.showSubtractedAlbumQuantity_2 = findViewById(R.id.album_quantity_2);
        this.showAlbumSubtotal_2 = findViewById(R.id.album_subtotal_2);

        this.showAddedAlbumQuantity_3 = findViewById(R.id.album_quantity_3);
        this.showSubtractedAlbumQuantity_3 = findViewById(R.id.album_quantity_3);
        this.showAlbumSubtotal_3 = findViewById(R.id.album_subtotal_3);

        this.showAddedAlbumQuantity_4 = findViewById(R.id.album_quantity_4);
        this.showSubtractedAlbumQuantity_4 = findViewById(R.id.album_quantity_4);
        this.showAlbumSubtotal_4 = findViewById(R.id.album_subtotal_4);

        this.showAddedAlbumQuantity_5 = findViewById(R.id.album_quantity_5);
        this.showSubtractedAlbumQuantity_5 = findViewById(R.id.album_quantity_5);
        this.showAlbumSubtotal_5 = findViewById(R.id.album_subtotal_5);

        this.showAddedAlbumQuantity_6 = findViewById(R.id.album_quantity_6);
        this.showSubtractedAlbumQuantity_6 = findViewById(R.id.album_quantity_6);
        this.showAlbumSubtotal_6 = findViewById(R.id.album_subtotal_6);

        this.showAddedAlbumQuantity_7 = findViewById(R.id.album_quantity_7);
        this.showSubtractedAlbumQuantity_7 = findViewById(R.id.album_quantity_7);
        this.showAlbumSubtotal_7 = findViewById(R.id.album_subtotal_7);

        this.showAddedAlbumQuantity_8 = findViewById(R.id.album_quantity_8);
        this.showSubtractedAlbumQuantity_8 = findViewById(R.id.album_quantity_8);
        this.showAlbumSubtotal_8 = findViewById(R.id.album_subtotal_8);

        this.showAddedAlbumQuantity_9 = findViewById(R.id.album_quantity_9);
        this.showSubtractedAlbumQuantity_9= findViewById(R.id.album_quantity_9);
        this.showAlbumSubtotal_9 = findViewById(R.id.album_subtotal_9);

        this.showAddedAlbumQuantity_10 = findViewById(R.id.album_quantity_10);
        this.showSubtractedAlbumQuantity_10 = findViewById(R.id.album_quantity_10);
        this.showAlbumSubtotal_10 = findViewById(R.id.album_subtotal_10);

    }



    @SuppressLint("SetTextI18n")
    public void showAlbumSubtotal(int albumQuantity, TextView idAlbumPrice, TextView albumSubtotal)
    {

        String printedAlbumPrice = idAlbumPrice.getText().toString().substring(1);
        double albumPrice = Double.parseDouble(printedAlbumPrice);
        double convertedAlbumSubtotal = albumPrice * albumQuantity;

        if (albumSubtotal != null)
        {
            albumSubtotal.setText("$" + convertedAlbumSubtotal);
        }

        addAlbumTotalSubtotal(convertedAlbumSubtotal);
    }




    public void addAlbumTotalSubtotal(double albumSubtotal)
    {
        this.finalSubtotal += albumSubtotal;
    }




    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity1(View view)
    {

            this.albumPrice_1 = view.findViewById(R.id.album_price_1);

            this.albumQuantity++;

            if (this.albumQuantity < 0)
            {
                this.albumQuantity = 0;
            }

            if (showAddedAlbumQuantity_1 != null)
                showAddedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity));

            showAlbumSubtotal(this.albumQuantity, this.albumPrice_1, this.showAlbumSubtotal_1);




    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity1(View view)
    {

            this.albumPrice_1 = view.findViewById(R.id.album_price_1);

            this.albumQuantity--;

            if (this.albumQuantity < 0)
            {
                this.albumQuantity = 0;
            }

            if (showSubtractedAlbumQuantity_1 != null)
            showSubtractedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity));

            showAlbumSubtotal(this.albumQuantity, this.albumPrice_1, this.showAlbumSubtotal_1);

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity2(View view)
    {

        this.albumQuantity++;

        if (this.albumQuantity < 0)
        {
            this.albumQuantity = 0;
        }

        if (showAddedAlbumQuantity_2 != null)
            showAddedAlbumQuantity_2.setText(Integer.toString(this.albumQuantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity2(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_2 != null)
            showSubtractedAlbumQuantity_2.setText(Integer.toString(this.quantity));

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity3(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_3 != null)
            showAddedAlbumQuantity_3.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity3(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_3 != null)
            showSubtractedAlbumQuantity_3.setText(Integer.toString(this.quantity));

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity4(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_4 != null)
            showAddedAlbumQuantity_4.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity4(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_4 != null)
            showSubtractedAlbumQuantity_4.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity5(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_5 != null)
            showAddedAlbumQuantity_5.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity5(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_5 != null)
            showSubtractedAlbumQuantity_5.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity6(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_6 != null)
            showAddedAlbumQuantity_6.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity6(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_6 != null)
            showSubtractedAlbumQuantity_6.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity7(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_7 != null)
            showAddedAlbumQuantity_7.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity7(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_7 != null)
            showSubtractedAlbumQuantity_7.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity8(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_8 != null)
            showAddedAlbumQuantity_8.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity8(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_8 != null)
            showSubtractedAlbumQuantity_8.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity9(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_9 != null)
            showAddedAlbumQuantity_9.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity9(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_9 != null)
            showSubtractedAlbumQuantity_9.setText(Integer.toString(this.quantity));

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity10(View view)
    {

        this.quantity++;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showAddedAlbumQuantity_10 != null)
            showAddedAlbumQuantity_10.setText(Integer.toString(this.quantity));

    }



    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity10(View view)
    {

        this.quantity--;

        if (this.quantity < 0)
        {
            this.quantity = 0;
        }

        if (showSubtractedAlbumQuantity_10 != null)
            showSubtractedAlbumQuantity_10.setText(Integer.toString(this.quantity));

    }







/*
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




*/


    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        checkoutIntent.putExtra(EXTRA_MESSAGE, "$" + this.finalSubtotal);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }

}


