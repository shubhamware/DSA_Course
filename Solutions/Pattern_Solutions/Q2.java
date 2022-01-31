package com.company;

public class Q2 {
    public static void main(String[] args) {
        patternQ2(4);

    }
    static void patternQ2(int size){
        for (int row=0;row<size;row++){
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
