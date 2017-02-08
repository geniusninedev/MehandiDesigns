package com.example.dev.mehandidesigns.Leg;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class LegImages {
    private Random randNo;
    private ArrayList<Integer> imageId;

    public LegImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.leg1);
        imageId.add(R.drawable.leg2);
        imageId.add(R.drawable.leg3);
        imageId.add(R.drawable.leg4);
        imageId.add(R.drawable.leg6);
        imageId.add(R.drawable.leg7);
        imageId.add(R.drawable.leg8);
        imageId.add(R.drawable.leg9);
        imageId.add(R.drawable.leg10);
        imageId.add(R.drawable.leg11);
        imageId.add(R.drawable.leg13);
        imageId.add(R.drawable.leg14);
        imageId.add(R.drawable.leg15);
        imageId.add(R.drawable.leg16);
        imageId.add(R.drawable.leg17);
        imageId.add(R.drawable.leg18);

        imageId.add(R.drawable.leg19);
        imageId.add(R.drawable.leg20);
        imageId.add(R.drawable.leg21);
        imageId.add(R.drawable.leg22);
        imageId.add(R.drawable.leg24);
        imageId.add(R.drawable.leg25);
        imageId.add(R.drawable.leg26);
        imageId.add(R.drawable.leg27);

        imageId.add(R.drawable.leg28);

        imageId.add(R.drawable.leg30);
        imageId.add(R.drawable.leg31);
        imageId.add(R.drawable.leg32);
        imageId.add(R.drawable.leg33);



    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}


