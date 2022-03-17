package com.datastruct;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {
       List<String> colorsUnmodifiable =  List.of(
               "pink",
               "white"
       );
       //colorsUnmodifiable.add("green");

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");

        System.out.println(colors.size());
        System.out.println(colors);
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("green"));

        //looping through list
        for(int i=0;i<= colors.size()-1;i++){
            System.out.println(colors.get(i));
        }

        for(String color: colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

    }
}
