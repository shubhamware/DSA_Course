package com.company;

public class Q6 {
    public static void main(String[] args) {
        patternQ6(5);
    }


    static void patternQ6(int size){
        for(int row=1;row<=size;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int row=1;row<=size;row++) {
            for (int col = 1; col <= size - row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
