package com.company;

public class Q8 {
    public static void main(String[] args) {
        patternQ8(4);

    }
    static void patternQ8(int size){
        int number=1;
        for (int row=1;row<=size;row++){
            for(int col=1;col<=row;col++){
                System.out.print(number+" ");
                ++number;
            }
            System.out.println();
        }

    }

}
