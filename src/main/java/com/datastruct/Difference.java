package com.datastruct;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
        int max = 0;
        int diff = 0;
        for(int i=0;i<this.elements.length-1;i++){
            for(int j=i+1; j<this.elements.length;j++) {
                if (this.elements[i] > this.elements[j]) {
                    diff = this.elements[i] - this.elements[j];
                } else {
                    diff = this.elements[j] - this.elements[i];
                }
                if (diff > max) {
                    max = diff;
                }
            }
        }
        maximumDifference =max;
        System.out.println(maximumDifference);
    }

    public static void main(String[] args) {
        int[] elements = new int[3];
        elements[0] = 1;
        elements[1] = 2;
        elements[2] = 5;
        Difference d = new Difference(elements);
        d.computeDifference();
    }
}
