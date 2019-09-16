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
    protected double finalAlbumSubtotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void modifyAlbumQuantity(View view) {


        ViewGroup item = (ViewGroup) view.getParent();
        TextView albumQuantity = item.findViewById(R.id.album_quantity);
        TextView albumPrice = item.findViewById(R.id.album_price);
        TextView albumSubtotal = item.findViewById(R.id.album_subtotal);
        TextView addingButton = item.findViewById(R.id.adding_button);
        TextView minusButton = item.findViewById(R.id.minus_button);
        TextView albumTotalSubtotal = item.findViewById(R.id.album_total_subtotal);


        String stringAlbumQuantity = albumQuantity.getText().toString();
        int integerAlbumQuantity = Integer.parseInt(stringAlbumQuantity);


        if (view.getId() == addingButton.getId())
        {
            integerAlbumQuantity++;
            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal);
            //showFinalSubtotal(albumSubtotal, albumTotalSubtotal);
        }

        else if (view.getId() == minusButton.getId())
        {
            integerAlbumQuantity--;
            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal);
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


    private void showFinalSubtotal(TextView albumSubtotal, TextView albumTotalSubtotal)
    {
        String initialStringAlbumSubtotal = albumSubtotal.getText().toString();
        String stringAlbumSubtotal = initialStringAlbumSubtotal.substring(1);
        double newAlbumSubtotal = Double.parseDouble(stringAlbumSubtotal);

        String initialStringAlbumTotalSubtotal = albumTotalSubtotal.getText().toString();
        String stringAlbumTotalSubtotal = initialStringAlbumTotalSubtotal.substring(1);
        double newAlbumTotalSubtotal = Double.parseDouble(stringAlbumTotalSubtotal);
        newAlbumTotalSubtotal += newAlbumSubtotal;
        albumTotalSubtotal.setText(String.format("$%s", newAlbumTotalSubtotal));
    }


    public void launchCheckoutActivity(View view)
    {
        Intent checkoutIntent = new Intent(this, CheckoutActivity.class);
        checkoutIntent.putExtra("Subtotal", this.finalAlbumSubtotal);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }

}


