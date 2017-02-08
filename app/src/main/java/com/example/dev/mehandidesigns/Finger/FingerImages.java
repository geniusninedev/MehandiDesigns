package com.example.dev.mehandidesigns.Finger;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Supriya on 08-02-2017.
 */

public class FingerImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public FingerImages() {
        imageId = new ArrayList<Integer>();
        imageId.add( R.drawable.finger1);
        imageId.add(R.drawable.finger2);
        imageId.add(R.drawable.finger3);
        imageId.add(R.drawable.finger4);
        imageId.add(R.drawable.finger5);
        imageId.add(R.drawable.finger6);
        imageId.add(R.drawable.finger7);
        imageId.add(R.drawable.finger8);

        imageId.add( R.drawable.finger10);
        imageId.add(R.drawable.finger11);
        imageId.add(R.drawable.finger12);
        imageId.add(R.drawable.finger13);
        imageId.add(R.drawable.finger14);
        imageId.add(R.drawable.finger15);
        imageId.add(R.drawable.finger16);
        imageId.add(R.drawable.finger17);

        imageId.add( R.drawable.finger18);
        imageId.add(R.drawable.finger19);
        imageId.add(R.drawable.finger20);
        imageId.add(R.drawable.finger21);
        imageId.add(R.drawable.finger22);
        imageId.add(R.drawable.finger23);
        imageId.add(R.drawable.finger24);
        imageId.add(R.drawable.finger25);

        imageId.add(R.drawable.finger26);
        imageId.add(R.drawable.finger27);
        imageId.add(R.drawable.finger28);
        imageId.add(R.drawable.finger29);
        imageId.add(R.drawable.finger30);

        imageId.add(R.drawable.finger31);
        imageId.add(R.drawable.finger32);
        imageId.add(R.drawable.finger33);
        imageId.add(R.drawable.finger34);

    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}
