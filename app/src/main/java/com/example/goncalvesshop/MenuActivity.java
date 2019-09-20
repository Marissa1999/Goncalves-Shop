package com.example.goncalvesshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {

    //The tag to call the MenuActivity class name when debugging code
    private static final String MENU_LOG_TAG = MenuActivity.class.getSimpleName();

    //These tags set the variable names that will be transferred to the CheckoutActivity class
    public static final String FINAL_SUBTOTAL = "com.example.android.goncalvesshop.extra.MESSAGE";
    public static final String TPS_TAX = "com.example.android.goncalvesshop.tps.TAX";
    public static final String TVQ_TAX = "com.example.android.goncalvesshop.tvq.TAX";
    public static final String FINAL_TOTAL = "com.example.android.goncalvesshop.final.TOTAL";

    //The tag to send a request to the CheckoutActivity class when it is launched
    public static final int TEXT_REQUEST = 1;

    //These Double instance variables hold values for final purchase totals
    private double finalSubtotal = 0.00;
    private double totalTPSTax = 0.00;
    private double totalTVQTax = 0.00;
    private double finalTotal = 0.00;

    //These TextView instance variables hold the String added quantity value for each CardView element
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

    //These TextView instance variables hold the album price for each CardView element
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

    //These TextView instance variables hold the String subtracted quantity value for each CardView element
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

    //These TextView instance variables hold the album quantity for each CardView element
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

    //These TextView instance variables hold the String subtotal value for each CardView element
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


    /*
    Start the MainActivity with this auto-implemented method and display all values from all ten CardView elements
    */
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Launch the MenuActivity class and display the design on the screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Set the TextView values to the specific ID tags from all CardView elements
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

        //Print a log message to ensure onCreate method's functionality
        Log.d(MENU_LOG_TAG, "Started MenuActivity and Displayed Quantity and Subtotal for All Albums");
    }


    /*
    Calculate the chosen album's subtotal from implemented arguments
     */
    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    public void showAlbumSubtotal(int albumQuantity, TextView idAlbumPrice, TextView albumSubtotal) {

        //Get the album price by converted the TextView element to a String value
        String printedAlbumPrice = idAlbumPrice.getText().toString().substring(1);

        //Convert the String album price value to a Double value
        double albumPrice = Double.parseDouble(printedAlbumPrice);

        //Calculate the subtotal by multiplying the album price and quantity
        double convertedAlbumSubtotal = albumPrice * albumQuantity;

        //Set the formatted album subtotal to the TextView album subtotal
        if (albumSubtotal != null)
            albumSubtotal.setText(String.format("$%.2f", convertedAlbumSubtotal));


        //Print a log message to ensure showAlbumSubtotal method's functionality
        Log.d(MENU_LOG_TAG, "Displayed Album Subtotal");

        //Call this method to calculate the final album subtotal
        calculateAlbumFinalSubtotal(convertedAlbumSubtotal);

        //Call this method to calculate the final album taxes
        calculateAlbumFinalTotalTaxes();

        //Call this method to calculate the final album total
        calculateAlbumFinalTotal();
    }


    /*
    Calculate the final subtotal instance variable
     */
    public void calculateAlbumFinalSubtotal(double albumSubtotal) {

        //Determine the final subtotal value by adding the CardView album subtotal to the variable
        this.finalSubtotal += albumSubtotal;

        //Print a log message to ensure calculateAlbumFinalSubtotal method's functionality
        Log.d(MENU_LOG_TAG, "Calculated Album Final Subtotal");
    }


    /*
    Calculate the instance variable values for both Canadian taxes
     */
    public void calculateAlbumFinalTotalTaxes() {

        //Determine the final subtotal value by adding the CardView album subtotal to the variable
        this.totalTPSTax = this.finalSubtotal * 0.05;
        this.totalTVQTax = this.finalSubtotal * 0.0975;

        //Print a log message to ensure calculateAlbumFinalTotalTaxes method's functionality
        Log.d(MENU_LOG_TAG, "Calculated Album Final Subtotal Taxes");
    }


    /*
    Calculate the final subtotal instance variable
     */
    public void calculateAlbumFinalTotal() {

        //Determine the final total value by adding the album subtotal and tax totals together
        this.finalTotal = this.finalSubtotal + this.totalTPSTax + this.totalTVQTax;

        //Print a log message to ensure calculateAlbumFinalTotal method's functionality
        Log.d(MENU_LOG_TAG, "Calculated Album Final Total");
    }


    /*
    Modifies the first album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity1(View view) {

        //Determine the first album price from the specified ID
        this.albumPrice_1 = findViewById(R.id.album_price_1);

        //Increment the first album quantity by 1
        this.albumQuantity_1++;

        //If the first album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_1 < 0) {
            this.albumQuantity_1 = 0;
        }

        //Convert the first album quantity Integer value to a String value and set it to the TextView first album quantity element
        if (this.showAddedAlbumQuantity_1 != null)
            this.showAddedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity_1));

        //Print a log message to ensure addAlbumQuantity1 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to First Album");

        //Call this method to calculate the first album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_1, this.albumPrice_1, this.showAlbumSubtotal_1);

    }


    /*
    Modifies the first album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity1(View view) {

        //Determine the first album price from the specified ID
        this.albumPrice_1 = findViewById(R.id.album_price_1);

        //Decrement the first album quantity by 1
        this.albumQuantity_1--;

        //If the first album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_1 < 0) {
            this.albumQuantity_1 = 0;
        }

        //Convert the first album quantity Integer value to a String value and set it to the TextView first album quantity element
        if (this.showSubtractedAlbumQuantity_1 != null)
            this.showSubtractedAlbumQuantity_1.setText(Integer.toString(this.albumQuantity_1));

        //Print a log message to ensure subtractAlbumQuantity1 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to First Album");

        //Call this method to calculate the first album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_1, this.albumPrice_1, this.showAlbumSubtotal_1);

    }

    /*
    Modifies the second album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity2(View view) {

        //Determine the second album price from the specified ID
        this.albumPrice_2 = findViewById(R.id.album_price_2);

        //Increment the second album quantity by 1
        this.albumQuantity_2++;

        //If the second album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_2 < 0) {
            this.albumQuantity_2 = 0;
        }

        //Convert the second album quantity Integer value to a String value and set it to the TextView second album quantity element
        if (showAddedAlbumQuantity_2 != null)
            showAddedAlbumQuantity_2.setText(Integer.toString(this.albumQuantity_2));

        //Print a log message to ensure addAlbumQuantity2 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Second Album");

        //Call this method to calculate the second album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_2, this.albumPrice_2, this.showAlbumSubtotal_2);

    }

    /*
    Modifies the second album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity2(View view) {

        //Determine the second album price from the specified ID
        this.albumPrice_2 = findViewById(R.id.album_price_2);

        //Decrement the second album quantity by 1
        this.albumQuantity_2--;

        //If the second album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_2 < 0) {
            this.albumQuantity_2 = 0;
        }

        //Convert the second album quantity Integer value to a String value and set it to the TextView second album quantity element
        if (showSubtractedAlbumQuantity_2 != null)
            showSubtractedAlbumQuantity_2.setText(Integer.toString(this.albumQuantity_2));

        //Print a log message to ensure subtractAlbumQuantity2 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Second Album");

        //Call this method to calculate the second album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_2, this.albumPrice_2, this.showAlbumSubtotal_2);

    }

    /*
    Modifies the third album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity3(View view) {

        //Determine the third album price from the specified ID
        this.albumPrice_3 = findViewById(R.id.album_price_3);

        //Increment the third album quantity by 1
        this.albumQuantity_3++;

        //If the third album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_3 < 0) {
            this.albumQuantity_3 = 0;
        }

        //Convert the third album quantity Integer value to a String value and set it to the TextView third album quantity element
        if (showAddedAlbumQuantity_3 != null)
            showAddedAlbumQuantity_3.setText(Integer.toString(this.albumQuantity_3));

        //Print a log message to ensure addAlbumQuantity3 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Third Album");

        //Call this method to calculate the third album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_3, this.albumPrice_3, this.showAlbumSubtotal_3);

    }

    /*
    Modifies the third album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity3(View view) {

        //Determine the third album price from the specified ID
        this.albumPrice_3 = findViewById(R.id.album_price_3);

        //Decrement the third album quantity by 1
        this.albumQuantity_3--;

        //If the third album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_3 < 0) {
            this.albumQuantity_3 = 0;
        }

        //Convert the third album quantity Integer value to a String value and set it to the TextView third album quantity element
        if (showSubtractedAlbumQuantity_3 != null)
            showSubtractedAlbumQuantity_3.setText(Integer.toString(this.albumQuantity_3));

        //Print a log message to ensure subtractAlbumQuantity3 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Third Album");

        //Call this method to calculate the third album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_3, this.albumPrice_3, this.showAlbumSubtotal_3);

    }

    //Modifies the fourth album's quantity value when the increment button is clicked
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity4(View view) {

        //Determine the fourth album price from the specified ID
        this.albumPrice_4 = findViewById(R.id.album_price_4);

        //Increment the fourth album quantity by 1
        this.albumQuantity_4++;

        //If the fourth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_4 < 0) {
            this.albumQuantity_4 = 0;
        }

        //Convert the fourth album quantity Integer value to a String value and set it to the TextView fourth album quantity element
        if (showAddedAlbumQuantity_4 != null)
            showAddedAlbumQuantity_4.setText(Integer.toString(this.albumQuantity_4));

        //Print a log message to ensure addAlbumQuantity4 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Fourth Album");

        //Call this method to calculate the fourth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_4, this.albumPrice_4, this.showAlbumSubtotal_4);

    }


    /*
    Modifies the fourth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity4(View view) {

        //Determine the fourth album price from the specified ID
        this.albumPrice_4 = findViewById(R.id.album_price_4);

        //Decrement the fourth album quantity by 1
        this.albumQuantity_4--;

        //If the fourth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_4 < 0) {
            this.albumQuantity_4 = 0;
        }

        //Convert the fourth album quantity Integer value to a String value and set it to the TextView fourth album quantity element
        if (showSubtractedAlbumQuantity_4 != null)
            showSubtractedAlbumQuantity_4.setText(Integer.toString(this.albumQuantity_4));

        //Print a log message to ensure subtractAlbumQuantity4 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Fourth Album");

        //Call this method to calculate the fourth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_4, this.albumPrice_4, this.showAlbumSubtotal_4);

    }

    /*
    Modifies the fifth album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity5(View view) {

        //Determine the fifth album price from the specified ID
        this.albumPrice_5 = findViewById(R.id.album_price_5);

        //Increment the fifth album quantity by 1
        this.albumQuantity_5++;

        //If the fifth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_5 < 0) {
            this.albumQuantity_5 = 0;
        }

        //Convert the fifth album quantity Integer value to a String value and set it to the TextView fifth album quantity element
        if (showAddedAlbumQuantity_5 != null)
            showAddedAlbumQuantity_5.setText(Integer.toString(this.albumQuantity_5));

        //Print a log message to ensure addAlbumQuantity5 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Fifth Album");

        //Call this method to calculate the fifth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_5, this.albumPrice_5, this.showAlbumSubtotal_5);

    }

    /*
    Modifies the fifth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity5(View view) {

        //Determine the fifth album price from the specified ID
        this.albumPrice_5 = findViewById(R.id.album_price_5);

        //Decrement the fifth album quantity by 1
        this.albumQuantity_5--;

        //If the fifth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_5 < 0) {
            this.albumQuantity_5 = 0;
        }

        //Convert the fifth album quantity Integer value to a String value and set it to the TextView fifth album quantity element
        if (showSubtractedAlbumQuantity_5 != null)
            showSubtractedAlbumQuantity_5.setText(Integer.toString(this.albumQuantity_5));

        //Print a log message to ensure subtractAlbumQuantity5 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Fifth Album");

        //Call this method to calculate the fifth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_5, this.albumPrice_5, this.showAlbumSubtotal_5);

    }

    /*
    Modifies the sixth album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity6(View view) {

        //Determine the sixth album price from the specified ID
        this.albumPrice_6 = findViewById(R.id.album_price_6);

        //Increment the sixth album quantity by 1
        this.albumQuantity_6++;

        //If the sixth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_6 < 0) {
            this.albumQuantity_6 = 0;
        }

        //Convert the sixth album quantity Integer value to a String value and set it to the TextView sixth album quantity element
        if (showAddedAlbumQuantity_6 != null)
            showAddedAlbumQuantity_6.setText(Integer.toString(this.albumQuantity_6));

        //Print a log message to ensure addAlbumQuantity6 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Sixth Album");

        //Call this method to calculate the sixth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_6, this.albumPrice_6, this.showAlbumSubtotal_6);

    }

    /*
    Modifies the sixth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity6(View view) {

        //Determine the sixth album price from the specified ID
        this.albumPrice_6 = findViewById(R.id.album_price_6);

        //Decrement the sixth album quantity by 1
        this.albumQuantity_6--;

        //If the sixth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_6 < 0) {
            this.albumQuantity_6 = 0;
        }

        //Convert the sixth album quantity Integer value to a String value and set it to the TextView sixth album quantity element
        if (showSubtractedAlbumQuantity_6 != null)
            showSubtractedAlbumQuantity_6.setText(Integer.toString(this.albumQuantity_6));

        //Print a log message to ensure subtractAlbumQuantity6 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Sixth Album");

        //Call this method to calculate the sixth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_6, this.albumPrice_6, this.showAlbumSubtotal_6);

    }

    /*
    Modifies the seventh album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity7(View view) {

        //Determine the seventh album price from the specified ID
        this.albumPrice_7 = findViewById(R.id.album_price_7);

        //Increment the seventh album quantity by 1
        this.albumQuantity_7++;

        //If the seventh album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_7 < 0) {
            this.albumQuantity_7 = 0;
        }

        //Convert the seventh album quantity Integer value to a String value and set it to the TextView seventh album quantity element
        if (showAddedAlbumQuantity_7 != null)
            showAddedAlbumQuantity_7.setText(Integer.toString(this.albumQuantity_7));

        //Print a log message to ensure addAlbumQuantity7 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Seventh Album");

        //Call this method to calculate the seventh album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_7, this.albumPrice_7, this.showAlbumSubtotal_7);

    }

    /*
    Modifies the seventh album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity7(View view) {

        //Determine the seventh album price from the specified ID
        this.albumPrice_7 = findViewById(R.id.album_price_7);

        //Decrement the seventh album quantity by 1
        this.albumQuantity_7--;

        //If the seventh album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_7 < 0) {
            this.albumQuantity_7 = 0;
        }

        //Convert the seventh album quantity Integer value to a String value and set it to the TextView seventh album quantity element
        if (showSubtractedAlbumQuantity_7 != null)
            showSubtractedAlbumQuantity_7.setText(Integer.toString(this.albumQuantity_7));

        //Print a log message to ensure subtractAlbumQuantity7 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Seventh Album");

        //Call this method to calculate the seventh album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_7, this.albumPrice_7, this.showAlbumSubtotal_7);

    }

    /*
    Modifies the eighth album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity8(View view) {

        //Determine the eighth album price from the specified ID
        this.albumPrice_8 = findViewById(R.id.album_price_8);

        //Increment the eighth album quantity by 1
        this.albumQuantity_8++;

        //If the eighth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_8 < 0) {
            this.albumQuantity_8 = 0;
        }

        //Convert the eighth album quantity Integer value to a String value and set it to the TextView eighth album quantity element
        if (showAddedAlbumQuantity_8 != null)
            showAddedAlbumQuantity_8.setText(Integer.toString(this.albumQuantity_8));

        //Print a log message to ensure addAlbumQuantity8 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Eighth Album");

        //Call this method to calculate the eighth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_8, this.albumPrice_8, this.showAlbumSubtotal_8);

    }

    /*
    Modifies the eighth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity8(View view) {

        //Determine the eighth album price from the specified ID
        this.albumPrice_8 = findViewById(R.id.album_price_8);

        //Decrement the eighth album quantity by 1
        this.albumQuantity_8--;

        //If the eighth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_8 < 0) {
            this.albumQuantity_8 = 0;
        }

        //Convert the eighth album quantity Integer value to a String value and set it to the TextView eighth album quantity element
        if (showSubtractedAlbumQuantity_8 != null)
            showSubtractedAlbumQuantity_8.setText(Integer.toString(this.albumQuantity_8));

        //Print a log message to ensure subtractAlbumQuantity8 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Eighth Album");

        //Call this method to calculate the eighth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_8, this.albumPrice_8, this.showAlbumSubtotal_8);

    }

    /*
    Modifies the ninth album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity9(View view) {

        //Determine the ninth album price from the specified ID
        this.albumPrice_9 = findViewById(R.id.album_price_9);

        //Increment the ninth album quantity by 1
        this.albumQuantity_9++;

        //If the ninth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_9 < 0) {
            this.albumQuantity_9 = 0;
        }

        //Convert the ninth album quantity Integer value to a String value and set it to the TextView ninth album quantity element
        if (showAddedAlbumQuantity_9 != null)
            showAddedAlbumQuantity_9.setText(Integer.toString(this.albumQuantity_9));

        //Print a log message to ensure addAlbumQuantity9 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Ninth Album");

        //Call this method to calculate the ninth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_9, this.albumPrice_9, this.showAlbumSubtotal_9);

    }

    /*
    Modifies the ninth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity9(View view) {

        //Determine the ninth album price from the specified ID
        this.albumPrice_9 = findViewById(R.id.album_price_9);

        //Decrement the ninth album quantity by 1
        this.albumQuantity_9--;

        //If the ninth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_9 < 0) {
            this.albumQuantity_9 = 0;
        }

        //Convert the ninth album quantity Integer value to a String value and set it to the TextView ninth album quantity element
        if (showSubtractedAlbumQuantity_9 != null)
            showSubtractedAlbumQuantity_9.setText(Integer.toString(this.albumQuantity_9));

        //Print a log message to ensure subtractAlbumQuantity9 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Ninth Album");

        //Call this method to calculate the ninth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_9, this.albumPrice_9, this.showAlbumSubtotal_9);

    }

    /*
    Modifies the tenth album's quantity value when the increment button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void addAlbumQuantity10(View view) {

        //Determine the tenth album price from the specified ID
        this.albumPrice_10 = findViewById(R.id.album_price_10);

        //Increment the tenth album quantity by 1
        this.albumQuantity_10++;

        //If the tenth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_10 < 0) {
            this.albumQuantity_10 = 0;
        }

        //Convert the tenth album quantity Integer value to a String value and set it to the TextView tenth album quantity element
        if (showAddedAlbumQuantity_10 != null)
            showAddedAlbumQuantity_10.setText(Integer.toString(this.albumQuantity_10));

        //Print a log message to ensure addAlbumQuantity10 method's functionality
        Log.d(MENU_LOG_TAG, "Added Quantity to Tenth Album");

        //Call this method to calculate the tenth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_10, this.albumPrice_10, this.showAlbumSubtotal_10);
    }

    /*
    Modifies the tenth album's quantity value when the decrement button is clicked
     */
    @SuppressLint("SetTextI18n")
    public void subtractAlbumQuantity10(View view) {

        //Determine the tenth album price from the specified ID
        this.albumPrice_10 = findViewById(R.id.album_price_10);

        //Decrement the tenth album quantity by 1
        this.albumQuantity_10--;

        //If the tenth album quantity is less than 0, the quantity should remain at 0
        if (this.albumQuantity_10 < 0) {
            this.albumQuantity_10 = 0;
        }

        //Convert the tenth album quantity Integer value to a String value and set it to the TextView tenth album quantity element
        if (showSubtractedAlbumQuantity_10 != null)
            showSubtractedAlbumQuantity_10.setText(Integer.toString(this.albumQuantity_10));

        //Print a log message to ensure subtractAlbumQuantity10 method's functionality
        Log.d(MENU_LOG_TAG, "Subtracted Quantity from Tenth Album");

        //Call this method to calculate the tenth album's subtotal according to implemented arguments
        showAlbumSubtotal(this.albumQuantity_10, this.albumPrice_10, this.showAlbumSubtotal_10);
    }

    /*
    Launch the CheckoutActivity class, which is supposed to be the following activity
     */
    @SuppressLint("DefaultLocale")
    public void launchCheckoutActivity(View view) {

        //Create an intent to start the following activity, which is MenuActivity
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);

        //Set the MenuActivity class formatted monetary values as tag names, in order for them to be used in the CheckoutActivity
        checkoutIntent.putExtra(FINAL_SUBTOTAL, String.format("$%.2f", this.finalSubtotal));
        checkoutIntent.putExtra(TPS_TAX, String.format("$%.2f", this.totalTPSTax));
        checkoutIntent.putExtra(TVQ_TAX, String.format("$%.2f", this.totalTVQTax));
        checkoutIntent.putExtra(FINAL_TOTAL, String.format("$%.2f", this.finalTotal));

        //Start the CheckoutActivity class and send a text request at the same time
        startActivityForResult(checkoutIntent, TEXT_REQUEST);

        //Print a log message to ensure launchCheckoutActivity method's functionality
        Log.d(MENU_LOG_TAG, "Transferred Subtotal, Tax Values and Final Total to CheckoutActivity with Clicked Button");
    }

}


