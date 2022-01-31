package com.company;

public class Q3 {
    public static void main(String[] args) {
        patternQ3(5);
    }
    static void patternQ3(int size){
        for(int row=0;row<size;row++){
            for(int col=row;col<size;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
