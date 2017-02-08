package com.example.dev.mehandidesigns.Dulhan;

import com.example.dev.mehandidesigns.R;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dev on 15-12-2016.
 */

public class DulhanImages {

    private Random randNo;
    private ArrayList<Integer> imageId;

    public DulhanImages() {
        imageId = new ArrayList<Integer>();
        imageId.add(R.drawable.dulhan2);
        imageId.add(R.drawable.dulhan3);
        imageId.add(R.drawable.dulhan4);
        imageId.add(R.drawable.dulhan6);
        imageId.add(R.drawable.dulhan7);
        imageId.add(R.drawable.dulhan8);
        imageId.add(R.drawable.dulhan9);
        imageId.add(R.drawable.dulhan10);

        imageId.add(R.drawable.dulhan11);
        imageId.add(R.drawable.dulhan12);
        imageId.add(R.drawable.dulhan13);
        imageId.add(R.drawable.dulhan14);
        imageId.add(R.drawable.dulhan15);
        imageId.add(R.drawable.dulhan16);
        imageId.add(R.drawable.dulhan17);
        imageId.add(R.drawable.dulhan18);

        imageId.add(R.drawable.dulhan20);
        imageId.add(R.drawable.dulhan21);
        imageId.add(R.drawable.dulhan23);
        imageId.add(R.drawable.dulhan24);
        imageId.add(R.drawable.dulhan25);
        imageId.add(R.drawable.dulhan26);
        imageId.add(R.drawable.dulhan27);
        imageId.add(R.drawable.dulhan28);

        imageId.add(R.drawable.dulhan29);
        imageId.add(R.drawable.dulhan30);

        imageId.add(R.drawable.dulhan32);
        imageId.add(R.drawable.dulhan33);




    }

    public int getImageId() {
        randNo = new Random();
        return imageId.get(randNo.nextInt(imageId.size()));
    }

    public ArrayList<Integer> getImageItem() {
        return imageId;
    }
}

