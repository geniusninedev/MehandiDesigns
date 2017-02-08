package com.example.dev.mehandidesigns.LearnMehandi;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Supriya on 08-02-2017.
 */

public class LearnImages {
    private Random randNo;
    private ArrayList<Integer> imageId;

    public LearnImages() {
        imageId = new ArrayList<Integer>();

        imageId.add(R.drawable.learn3);
        imageId.add(R.drawable.learn4);
        imageId.add(R.drawable.leran5);
        imageId.add(R.drawable.learn6);
        imageId.add(R.drawable.learn7);
        imageId.add(R.drawable.learn8);

        imageId.add( R.drawable.learn10);
        imageId.add(R.drawable.learn13);
        imageId.add(R.drawable.learn15);
        imageId.add(R.drawable.learn16);
        imageId.add(R.drawable.learn17);

        imageId.add( R.drawable.learn18);
        imageId.add(R.drawable.learn19);
        imageId.add(R.drawable.learn20);
        imageId.add(R.drawable.learn21);
        imageId.add(R.drawable.learn22);
        imageId.add(R.drawable.learn23);
        imageId.add(R.drawable.learn24);
        imageId.add(R.drawable.learn25);

        imageId.add(R.drawable.learn26);
        imageId.add(R.drawable.learn27);
        imageId.add(R.drawable.learn28);
        imageId.add(R.drawable.learn29);
        imageId.add(R.drawable.learn30);

        imageId.add(R.drawable.learn31);


    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}

