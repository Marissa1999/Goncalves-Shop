package com.example.goncalvesshop;

import android.view.ViewGroup;
import android.widget.TextView;


public class ShoppingCart
{

    private ViewGroup view;
    private String showAlbumTitle;
    private String showAlbumDescription;
    private double showAlbumPrice;
    private int showAlbumQuantity;


    public void addAlbum(String albumTitle, String albumDescription, double albumPrice, int albumQuantity)
    {
         showAlbumTitle = albumTitle;
         showAlbumDescription = albumDescription;
         showAlbumPrice = albumPrice;
         showAlbumQuantity = albumQuantity;
    }


    public int getAlbumString(int i)
    {
        return Integer.parseInt(String.valueOf(view.getChildAt(i)));
    }

}
