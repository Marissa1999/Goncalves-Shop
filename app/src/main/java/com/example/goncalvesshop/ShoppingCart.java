package com.example.goncalvesshop;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ShoppingCart implements Parcelable
{

    private ViewGroup view;
    private int numberOfAlbums;
    private int albumQuantity;
    private String albumTitle;
    private double albumPrice;
    private double albumSubtotal;
    private ShoppingCart[] checkoutAlbumCollection;


    public ShoppingCart()
    {
        this.numberOfAlbums = 0;
        this.checkoutAlbumCollection = new ShoppingCart[numberOfAlbums];
    }

    public ShoppingCart(String albumTitle, double albumPrice, int albumQuantity)
    {
        this.albumTitle = albumTitle;
        this.albumPrice = albumPrice;
        this.albumQuantity = albumQuantity;
    }


    protected ShoppingCart(Parcel in) {
        numberOfAlbums = in.readInt();
        albumQuantity = in.readInt();
        albumTitle = in.readString();
        albumPrice = in.readDouble();
        albumSubtotal = in.readDouble();
        checkoutAlbumCollection = in.createTypedArray(ShoppingCart.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(numberOfAlbums);
        dest.writeInt(albumQuantity);
        dest.writeString(albumTitle);
        dest.writeDouble(albumPrice);
        dest.writeDouble(albumSubtotal);
        dest.writeTypedArray(checkoutAlbumCollection, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ShoppingCart> CREATOR = new Creator<ShoppingCart>() {
        @Override
        public ShoppingCart createFromParcel(Parcel in) {
            return new ShoppingCart(in);
        }

        @Override
        public ShoppingCart[] newArray(int size) {
            return new ShoppingCart[size];
        }
    };

    public void addAlbum(String albumTitle, String albumDescription, double albumPrice, int albumQuantity) {

        int maximumNumberOfAlbums = this.checkoutAlbumCollection.length;

        if (this.numberOfAlbums < maximumNumberOfAlbums)
        {
            ShoppingCart album = new ShoppingCart(albumTitle, albumPrice, albumQuantity);
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
