package com.example.dev.mehandidesigns.Floral;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class FloralImages {
    private Random randNo;
    private ArrayList<Integer> imageId;

    public FloralImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.floral1);
        imageId.add(R.drawable.floral11);
        imageId.add(R.drawable.floral2);
        imageId.add(R.drawable.floral3);
        imageId.add(R.drawable.floral4);
        imageId.add(R.drawable.floral5);
        imageId.add(R.drawable.floral6);

        imageId.add(R.drawable.floral8);
        imageId.add(R.drawable.floral9);
        imageId.add(R.drawable.floral10);
        imageId.add(R.drawable.floral15);
        imageId.add(R.drawable.floral16);
        imageId.add(R.drawable.floral17);
        imageId.add(R.drawable.floral18);
        imageId.add(R.drawable.floral12);
        imageId.add(R.drawable.floral13);

        imageId.add(R.drawable.floral19);
        imageId.add(R.drawable.floral2);
        imageId.add(R.drawable.floral20);
        imageId.add(R.drawable.floral21);
        imageId.add(R.drawable.floral22);

        imageId.add(R.drawable.arabic36);
        imageId.add(R.drawable.arabic37);
        imageId.add(R.drawable.arabic38);
        imageId.add(R.drawable.arabic39);
        imageId.add(R.drawable.arabic40);
        imageId.add(R.drawable.arabic41);


    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}

