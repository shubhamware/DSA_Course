package com.company;

public class Q1 {
    public static void main(String[] args) {
        patternQ1(4);

    }
    static void patternQ1(int size){
        for (int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
