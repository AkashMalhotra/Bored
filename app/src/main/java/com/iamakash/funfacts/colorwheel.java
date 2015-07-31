package com.iamakash.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by akash on 2015-07-26.
 */
public class colorwheel {

    public String[] mcolors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7",
            "#4169E1",
            "#F0F8FF",
            "#FFEBCD",
            "#F5F5DC",
    	    "#FFE4C4",
 	        "#000000",
            "#FFEBCD",
            "#0000FF",
            "#8A2BE2",
    };
    public int getcolor(){

        //button clicked, update with new fact
        String COLOR = "";
        //randomly select fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mcolors.length);
        COLOR=mcolors[randomNumber];
        int colorAsInt= Color.parseColor(COLOR);
        return colorAsInt;
    }


}


