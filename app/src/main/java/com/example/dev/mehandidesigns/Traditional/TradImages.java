package com.example.dev.mehandidesigns.Traditional;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class TradImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public TradImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(   R.drawable.trad1);
        imageId.add(R.drawable.trad2);
        imageId.add(R.drawable.trad3);
        imageId.add(R.drawable.trad4);

        imageId.add(R.drawable.trad6);
        imageId.add(R.drawable.trad7);
        imageId.add(R.drawable.trad8);
        imageId.add(R.drawable.trad9);
        imageId.add(R.drawable.trad10);
        imageId.add(R.drawable.leg10);
        imageId.add(R.drawable.leg11);
        imageId.add(R.drawable.trad11);
        imageId.add(R.drawable.trad12);
        imageId.add(R.drawable.trad13);
        imageId.add(R.drawable.trad14);
        imageId.add(R.drawable.leg22);
        imageId.add(R.drawable.leg24);
        imageId.add(R.drawable.leg25);
        imageId.add(R.drawable.trad15);
        imageId.add(R.drawable.trad16);
        imageId.add(R.drawable.trad18);


    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}



