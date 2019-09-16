package com.example.goncalvesshop;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MenuActivity extends AppCompatActivity {


    private static final String LOG_TAG = MenuActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_CART = "com.example.goncalvesshop.extra.CART";
    private ShoppingCart cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        cart = new ShoppingCart();
    }


    public void modifyAlbumQuantity(View view) {

        ViewGroup item = (ViewGroup) view.getParent();
        TextView albumQuantity = item.findViewById(R.id.album_quantity);
        TextView albumPrice = item.findViewById(R.id.album_price);
        TextView albumSubtotal = item.findViewById(R.id.album_subtotal);
        TextView albumTitle = item.findViewById(R.id.album_title);
        TextView albumDescription = item.findViewById(R.id.album_description);
        TextView addingButton = item.findViewById(R.id.adding_button);
        TextView minusButton = item.findViewById(R.id.minus_button);

        String stringAlbumQuantity = albumQuantity.getText().toString();
        int integerAlbumQuantity = Integer.parseInt(stringAlbumQuantity);

        if (view.getId() == addingButton.getId())
        {
            integerAlbumQuantity++;
            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal);
        }

        else if (view.getId() == minusButton.getId())
        {
            integerAlbumQuantity--;
            showAlbumQuantity(integerAlbumQuantity, albumQuantity);
            showAlbumSubtotal(integerAlbumQuantity, albumPrice, albumSubtotal);

            String initialStringAlbumPrice = albumPrice.getText().toString();
            String stringAlbumPrice = initialStringAlbumPrice.substring(1);
            double integerAlbumPrice = Double.parseDouble(stringAlbumPrice);

            cart.addAlbum(albumTitle.getText().toString(), albumDescription.getText().toString(), integerAlbumPrice, integerAlbumQuantity);

            Toast.makeText(this, cart.getAlbumString(0), Toast.LENGTH_SHORT).show();
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
        checkoutIntent.putExtra(EXTRA_CART, cart);
        startActivityForResult(checkoutIntent, TEXT_REQUEST);
    }

}


