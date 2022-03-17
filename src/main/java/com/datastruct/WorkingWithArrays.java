package com.datastruct;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        //System.out.println(colors[5]);

        colors[2]= "yellow";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};

        //looping through arrays
        //Using for loop
        for(int i=0;i< colors.length;i++){
            System.out.println(colors[i]);
        }
        //Reverse looping
        for(int i= colors.length-1;i>=0;i--){
            System.out.println(colors[i]);
        }
        System.out.println(colors.length);

        //Using enhanced for loop
        for(String color:colors){
            System.out.println(color);
        }

        //Using foreach of Java 8
        Arrays.stream(colors).forEach(System.out::println);
    }
}
