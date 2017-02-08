package com.example.dev.mehandidesigns.Arabic;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class ArabicImages {
    private Random randNo;
    private ArrayList<Integer> imageId;

    public ArabicImages() {
        imageId = new ArrayList<Integer>();
        imageId.add( R.drawable.arabic1);
        imageId.add(R.drawable.arabic2);
        imageId.add(R.drawable.arabic3);
        imageId.add(R.drawable.arabic4);
        imageId.add(R.drawable.arabic5);
        imageId.add(R.drawable.arabic6);
        imageId.add(R.drawable.arabic7);
        imageId.add(R.drawable.arabic8);

        imageId.add( R.drawable.arabic10);
        imageId.add(R.drawable.arabic12);
        imageId.add(R.drawable.arabic15);
        imageId.add(R.drawable.arabic18);
        imageId.add(R.drawable.arabic20);
        imageId.add(R.drawable.arabic21);
        imageId.add(R.drawable.arabic22);
        imageId.add(R.drawable.arabic24);

        imageId.add( R.drawable.arabic25);
        imageId.add(R.drawable.arabic26);
        imageId.add(R.drawable.arabic27);
        imageId.add(R.drawable.arabic28);
        imageId.add(R.drawable.arabic29);
        imageId.add(R.drawable.arabic30);
        imageId.add(R.drawable.arabic31);
        imageId.add(R.drawable.arabic32);

        imageId.add(R.drawable.arabic33);
        imageId.add(R.drawable.arabic34);
        imageId.add(R.drawable.arabic35);

    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}