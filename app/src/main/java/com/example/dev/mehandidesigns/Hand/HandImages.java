package com.example.dev.mehandidesigns.Hand;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class HandImages {
    private Random randNo;
    private ArrayList<Integer> imageId;

    public HandImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.hand1);
        imageId.add(R.drawable.hand2);
        imageId.add(R.drawable.hand3);
        imageId.add(R.drawable.hand4);
        imageId.add(R.drawable.hand5);
        imageId.add(R.drawable.hand6);
        imageId.add(R.drawable.hand7);
        imageId.add(R.drawable.hand8);
        imageId.add(R.drawable.hand9);
        imageId.add(R.drawable.hand10);
        imageId.add(R.drawable.hand11);
        imageId.add(R.drawable.hand12);
        imageId.add(R.drawable.hand13);
        imageId.add(R.drawable.hand14);
        imageId.add(R.drawable.hand15);
        imageId.add(R.drawable.hand16);
        imageId.add(R.drawable.hand17);
        imageId.add(R.drawable.hand18);
        imageId.add(R.drawable.hand19);
        imageId.add(R.drawable.hand20);
        imageId.add(R.drawable.hand21);
        imageId.add(R.drawable.hand22);
        imageId.add(R.drawable.hand23);
        imageId.add(R.drawable.hand24);
        imageId.add(R.drawable.hand25);
        imageId.add(R.drawable.hand26);
        imageId.add(R.drawable.hand27);
        imageId.add(R.drawable.hand28);
        imageId.add(R.drawable.hand30);

    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}


