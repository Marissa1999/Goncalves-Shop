package com.example.goncalvesshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {


    private static final String LOG_TAG = MenuActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;

    TextView albumQuantity = findViewById(R.id.album_quantity_1);
    TextView albumPrice = findViewById(R.id.album_price_1);
    TextView addingButton = findViewById(R.id.adding_button);
    TextView minusButton = findViewById(R.id.minus_button);
    TextView albumSubtotal_1 = findViewById(R.id.album_subtotal_1);
    TextView albumSubtotal_2 = findViewById(R.id.album_subtotal_2);
    TextView albumSubtotal_3 = findViewById(R.id.album_subtotal_3);
    TextView albumSubtotal_4 = findViewById(R.id.album_subtotal_4);
    TextView albumSubtotal_5 = findViewById(R.id.album_subtotal_5);
    TextView albumSubtotal_6 = findViewById(R.id.album_subtotal_6);



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
            //showFinalSubtotal(albumSubtotal, albumTotalSubtotal);
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
            //showFinalSubtotal(albumSubtotal, albumTotalSubtotal);
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


    private void showAlbumQuantity(int integerAlbumQuantity, TextView albumQuantity)
    {
        String convertedAlbumQuantity = Integer.toString(integerAlbumQuantity);
        albumQuantity.setText(convertedAlbumQuantity);
    }




    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }

}


