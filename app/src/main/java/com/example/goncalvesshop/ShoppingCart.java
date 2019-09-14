package com.example.goncalvesshop;

import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ShoppingCart
{

    private ViewGroup view;
    private int numberOfAlbums;
    private int albumQuantity;
    private String albumTitle;
    private String albumDescription;
    private double albumPrice;
    private double albumSubtotal;
    private ShoppingCart[] checkoutAlbumCollection;


    public ShoppingCart()
    {
        this.numberOfAlbums = 0;
        this.checkoutAlbumCollection = new ShoppingCart[numberOfAlbums];
    }

    public ShoppingCart(String albumTitle, String albumDescription, double albumPrice, int albumQuantity)
    {
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.albumPrice = albumPrice;
        this.albumQuantity = albumQuantity;
    }


    public void addAlbum(String albumTitle, String albumDescription, double albumPrice, int albumQuantity) {

        int maximumNumberOfAlbums = this.checkoutAlbumCollection.length;

        if (this.numberOfAlbums < maximumNumberOfAlbums)
        {
            ShoppingCart album = new ShoppingCart(albumTitle, albumDescription, albumPrice, albumQuantity);
            checkoutAlbumCollection[this.numberOfAlbums] = album;
            this.numberOfAlbums++;
        }
    }


    public int getAlbumString(int i)
    {
        String item = "";

        for (int t = 0; t < i; t++)
        {
            item += checkoutAlbumCollection[i];
        }

        return Integer.parseInt(String.valueOf(view.getChildAt(i)));
    }

}
