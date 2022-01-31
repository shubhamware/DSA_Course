package com.company;

public class Q4 {
    public static void main(String[] args) {
        patternQ4(5);

    }
    static void patternQ4(int size){
        for(int row=1;row<=size;row++){

            for(int col=1;col<=row;col++){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
