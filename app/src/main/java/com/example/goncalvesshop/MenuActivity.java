package com.example.goncalvesshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {


    private static final String MENU_LOG_TAG = MenuActivity.class.getSimpleName();
    public static final String FINAL_SUBTOTAL = "com.example.android.goncalvesshop.extra.MESSAGE";
    public static final String TPS_TAX = "com.example.android.goncalvesshop.tps.TAX";
    public static final String TVQ_TAX = "com.example.android.goncalvesshop.tvq.TAX";
    public static final String FINAL_TOTAL = "com.example.android.goncalvesshop.final.TOTAL";
    public static final int TEXT_REQUEST = 1;

    private double finalSubtotal = 0.00;
    private double totalTPSTax = 0.00;
    private double totalTVQTax = 0.00;
    private double finalTotal = 0.00;

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

    private int albumQuantity_1 = 0;
    private int albumQuantity_2 = 0;
    private int albumQuantity_3 = 0;
    private int albumQuantity_4 = 0;
    private int albumQuantity_5 = 0;
    private int albumQuantity_6 = 0;
    private int albumQuantity_7 = 0;
    private int albumQuantity_8 = 0;
    private int albumQuantity_9 = 0;
    private int albumQuantity_10 = 0;

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
    protected void onCreate(Bundle savedInstanceState) {
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
        this.showSubtractedAlbumQuantity_9 = findViewById(R.id.album_quantity_9);
        this.showAlbumSubtotal_9 = findViewById(R.id.album_subtotal_9);

        this.showAddedAlbumQuantity_10 = findViewById(R.id.album_quantity_10);
        this.showSubtractedAlbumQuantity_10 = findViewById(R.id.album_quantity_10);
        this.showAlbumSubtotal_10 = findViewById(R.id.album_subtotal_10);

        Log.d(MENU_LOG_TAG, "Started MenuActivity and Displayed Quantity and Subtotal for All Albums");
    }


    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void showAlbumSubtotal(int albumQuantity, TextView idAlbumPrice, TextView albumSubtotal) {

        String printedAlbumPrice = idAlbumPrice.getText().toString().substring(1);
        double albumPrice = Double.parseDouble(printedAlbumPrice);
        double convertedAlbumSubtotal = albumPrice * albumQuantity;

        if (albumSubtotal != null) {
            albumSubtotal.setText(String.format("$%.2f", convertedAlbumSubtotal));
        }

        Log.d(MENU_LOG_TAG, "Displayed Album Subtotal");

        calculateAlbumFinalSubtotal(convertedAlbumSubtotal);
        calculateAlbumFinalTotalTaxes();
        calculateAlbumFinalTotal();
    }


    public void calculateAlbumFinalSubtotal(double albumSubtotal) {
        this.finalSubtotal += albumSubtotal;

        Log.d(MENU_LOG_TAG, "Calculated Album Final Subtotal");
    }


    public void calculateAlbumFinalTotalTaxes() {
        this.totalTPSTax = this.finalSubtotal * 0.05;
        this.totalTVQTax = this.finalSubtotal * 0.0975;

        Log.d(MENU_LOG_TAG, "Calculated Album Final Subtotal Taxes");
    }


    public void calculateAlbumFinalTotal() {
        this.finalTotal = this.finalSubtotal + this.totalTPSTax + this.totalTVQTax;

        Log.d(MENU_LOG_TAG, "Calculated Album Final Total");
    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity1(View view) {

        this.albumPrice_1 = findViewById(R.id.album_price_1);

        this.albumQuantity_1++;

        if (this.albumQuantity_1 < 0) {
            this.albumQuantity_1 = 0;
        }

        if (showAddedAlbumQuantity_1 != null)
            showAddedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity_1));

        showAlbumSubtotal(this.albumQuantity_1, this.albumPrice_1, this.showAlbumSubtotal_1);

        Log.d(MENU_LOG_TAG, "Added Quantity to First Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity1(View view) {

        this.albumPrice_1 = findViewById(R.id.album_price_1);

        this.albumQuantity_1--;

        if (this.albumQuantity_1 < 0) {
            this.albumQuantity_1 = 0;
        }

        if (showSubtractedAlbumQuantity_1 != null)
            showSubtractedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity_1));

        showAlbumSubtotal(this.albumQuantity_1, this.albumPrice_1, this.showAlbumSubtotal_1);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from First Album");

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity2(View view) {

        this.albumPrice_2 = findViewById(R.id.album_price_2);

        this.albumQuantity_2++;

        if (this.albumQuantity_2 < 0) {
            this.albumQuantity_2 = 0;
        }

        if (showAddedAlbumQuantity_2 != null)
            showAddedAlbumQuantity_2.setText(Integer.toString(this.albumQuantity_2));

        showAlbumSubtotal(this.albumQuantity_2, this.albumPrice_2, this.showAlbumSubtotal_2);

        Log.d(MENU_LOG_TAG, "Added Quantity to Second Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity2(View view) {

        this.albumPrice_2 = findViewById(R.id.album_price_2);

        this.albumQuantity_2--;

        if (this.albumQuantity_2 < 0) {
            this.albumQuantity_2 = 0;
        }

        if (showSubtractedAlbumQuantity_2 != null)
            showSubtractedAlbumQuantity_2.setText(Integer.toString(this.albumQuantity_2));

        showAlbumSubtotal(this.albumQuantity_2, this.albumPrice_2, this.showAlbumSubtotal_2);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Second Album");

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity3(View view) {

        this.albumPrice_3 = findViewById(R.id.album_price_3);

        this.albumQuantity_3++;

        if (this.albumQuantity_3 < 0) {
            this.albumQuantity_3 = 0;
        }

        if (showAddedAlbumQuantity_3 != null)
            showAddedAlbumQuantity_3.setText(Integer.toString(this.albumQuantity_3));

        showAlbumSubtotal(this.albumQuantity_3, this.albumPrice_3, this.showAlbumSubtotal_3);

        Log.d(MENU_LOG_TAG, "Added Quantity to Third Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity3(View view) {
        this.albumPrice_3 = findViewById(R.id.album_price_3);

        this.albumQuantity_3--;

        if (this.albumQuantity_3 < 0) {
            this.albumQuantity_3 = 0;
        }

        if (showSubtractedAlbumQuantity_3 != null)
            showSubtractedAlbumQuantity_3.setText(Integer.toString(this.albumQuantity_3));

        showAlbumSubtotal(this.albumQuantity_3, this.albumPrice_3, this.showAlbumSubtotal_3);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Third Album");

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity4(View view) {

        this.albumPrice_4 = findViewById(R.id.album_price_4);

        this.albumQuantity_4++;

        if (this.albumQuantity_4 < 0) {
            this.albumQuantity_4 = 0;
        }

        if (showAddedAlbumQuantity_4 != null)
            showAddedAlbumQuantity_4.setText(Integer.toString(this.albumQuantity_4));

        showAlbumSubtotal(this.albumQuantity_4, this.albumPrice_4, this.showAlbumSubtotal_4);

        Log.d(MENU_LOG_TAG, "Added Quantity to Fourth Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity4(View view) {

        this.albumPrice_4 = findViewById(R.id.album_price_4);

        this.albumQuantity_4--;

        if (this.albumQuantity_4 < 0) {
            this.albumQuantity_4 = 0;
        }

        if (showSubtractedAlbumQuantity_4 != null)
            showSubtractedAlbumQuantity_4.setText(Integer.toString(this.albumQuantity_4));

        showAlbumSubtotal(this.albumQuantity_4, this.albumPrice_4, this.showAlbumSubtotal_4);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Fourth Album");

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity5(View view) {

        this.albumPrice_5 = findViewById(R.id.album_price_5);

        this.albumQuantity_5++;

        if (this.albumQuantity_5 < 0) {
            this.albumQuantity_5 = 0;
        }

        if (showAddedAlbumQuantity_5 != null)
            showAddedAlbumQuantity_5.setText(Integer.toString(this.albumQuantity_5));

        showAlbumSubtotal(this.albumQuantity_5, this.albumPrice_5, this.showAlbumSubtotal_5);

        Log.d(MENU_LOG_TAG, "Added Quantity to Fifth Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity5(View view) {

        this.albumPrice_5 = findViewById(R.id.album_price_5);

        this.albumQuantity_5--;

        if (this.albumQuantity_5 < 0) {
            this.albumQuantity_5 = 0;
        }

        if (showSubtractedAlbumQuantity_5 != null)
            showSubtractedAlbumQuantity_5.setText(Integer.toString(this.albumQuantity_5));

        showAlbumSubtotal(this.albumQuantity_5, this.albumPrice_5, this.showAlbumSubtotal_5);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Fifth Album");

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity6(View view) {

        this.albumPrice_6 = findViewById(R.id.album_price_6);

        this.albumQuantity_6++;

        if (this.albumQuantity_6 < 0) {
            this.albumQuantity_6 = 0;
        }

        if (showAddedAlbumQuantity_6 != null)
            showAddedAlbumQuantity_6.setText(Integer.toString(this.albumQuantity_6));

        showAlbumSubtotal(this.albumQuantity_6, this.albumPrice_6, this.showAlbumSubtotal_6);

        Log.d(MENU_LOG_TAG, "Added Quantity to Sixth Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity6(View view) {

        this.albumPrice_6 = findViewById(R.id.album_price_6);

        this.albumQuantity_6--;

        if (this.albumQuantity_6 < 0) {
            this.albumQuantity_6 = 0;
        }

        if (showSubtractedAlbumQuantity_6 != null)
            showSubtractedAlbumQuantity_6.setText(Integer.toString(this.albumQuantity_6));

        showAlbumSubtotal(this.albumQuantity_6, this.albumPrice_6, this.showAlbumSubtotal_6);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Sixth Album");

    }

    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity7(View view) {

        this.albumPrice_7 = findViewById(R.id.album_price_7);

        this.albumQuantity_7++;

        if (this.albumQuantity_7 < 0) {
            this.albumQuantity_7 = 0;
        }

        if (showAddedAlbumQuantity_7 != null)
            showAddedAlbumQuantity_7.setText(Integer.toString(this.albumQuantity_7));

        showAlbumSubtotal(this.albumQuantity_7, this.albumPrice_7, this.showAlbumSubtotal_7);

        Log.d(MENU_LOG_TAG, "Added Quantity to Seventh Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity7(View view) {

        this.albumPrice_7 = findViewById(R.id.album_price_7);

        this.albumQuantity_7--;

        if (this.albumQuantity_7 < 0) {
            this.albumQuantity_7 = 0;
        }

        if (showSubtractedAlbumQuantity_7 != null)
            showSubtractedAlbumQuantity_7.setText(Integer.toString(this.albumQuantity_7));

        showAlbumSubtotal(this.albumQuantity_7, this.albumPrice_7, this.showAlbumSubtotal_7);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Seventh Album");

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity8(View view) {

        this.albumPrice_8 = findViewById(R.id.album_price_8);

        this.albumQuantity_8++;

        if (this.albumQuantity_8 < 0) {
            this.albumQuantity_8 = 0;
        }

        if (showAddedAlbumQuantity_8 != null)
            showAddedAlbumQuantity_8.setText(Integer.toString(this.albumQuantity_8));

        showAlbumSubtotal(this.albumQuantity_8, this.albumPrice_8, this.showAlbumSubtotal_8);

        Log.d(MENU_LOG_TAG, "Added Quantity to Eighth Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity8(View view) {

        this.albumPrice_8 = findViewById(R.id.album_price_8);

        this.albumQuantity_8--;

        if (this.albumQuantity_8 < 0) {
            this.albumQuantity_8 = 0;
        }

        if (showSubtractedAlbumQuantity_8 != null)
            showSubtractedAlbumQuantity_8.setText(Integer.toString(this.albumQuantity_8));

        showAlbumSubtotal(this.albumQuantity_8, this.albumPrice_8, this.showAlbumSubtotal_8);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Eighth Album");
    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity9(View view) {

        this.albumPrice_9 = findViewById(R.id.album_price_9);

        this.albumQuantity_9++;

        if (this.albumQuantity_9 < 0) {
            this.albumQuantity_9 = 0;
        }

        if (showAddedAlbumQuantity_9 != null)
            showAddedAlbumQuantity_9.setText(Integer.toString(this.albumQuantity_9));

        showAlbumSubtotal(this.albumQuantity_9, this.albumPrice_9, this.showAlbumSubtotal_9);

        Log.d(MENU_LOG_TAG, "Added Quantity to Ninth Album");

    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity9(View view) {

        this.albumPrice_9 = findViewById(R.id.album_price_9);

        this.albumQuantity_9--;

        if (this.albumQuantity_9 < 0) {
            this.albumQuantity_9 = 0;
        }

        if (showSubtractedAlbumQuantity_9 != null)
            showSubtractedAlbumQuantity_9.setText(Integer.toString(this.albumQuantity_9));

        showAlbumSubtotal(this.albumQuantity_9, this.albumPrice_9, this.showAlbumSubtotal_9);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Ninth Album");

    }


    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity10(View view) {

        this.albumPrice_10 = findViewById(R.id.album_price_10);

        this.albumQuantity_10++;

        if (this.albumQuantity_10 < 0) {
            this.albumQuantity_10 = 0;
        }

        if (showAddedAlbumQuantity_10 != null)
            showAddedAlbumQuantity_10.setText(Integer.toString(this.albumQuantity_10));

        showAlbumSubtotal(this.albumQuantity_10, this.albumPrice_10, this.showAlbumSubtotal_10);

        Log.d(MENU_LOG_TAG, "Added Quantity to Tenth Album");
    }


    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity10(View view) {

        this.albumPrice_10 = findViewById(R.id.album_price_10);

        this.albumQuantity_10--;

        if (this.albumQuantity_10 < 0) {
            this.albumQuantity_10 = 0;
        }

        if (showSubtractedAlbumQuantity_10 != null)
            showSubtractedAlbumQuantity_10.setText(Integer.toString(this.albumQuantity_10));

        showAlbumSubtotal(this.albumQuantity_10, this.albumPrice_10, this.showAlbumSubtotal_10);

        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Tenth Album");
    }


    @SuppressLint("DefaultLocale")
    public void launchCheckoutActivity(View view) {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        checkoutIntent.putExtra(FINAL_SUBTOTAL, String.format("$%.2f", this.finalSubtotal));
        checkoutIntent.putExtra(TPS_TAX, String.format("$%.2f", this.totalTPSTax));
        checkoutIntent.putExtra(TVQ_TAX, String.format("$%.2f", this.totalTVQTax));
        checkoutIntent.putExtra(FINAL_TOTAL, String.format("$%.2f", this.finalTotal));
        startActivityForResult(checkoutIntent, TEXT_REQUEST);

        Log.d(MENU_LOG_TAG, "Transferred Subtotal, Tax Values and Final Total to CheckoutActivity with Clicked Button");
    }

}


