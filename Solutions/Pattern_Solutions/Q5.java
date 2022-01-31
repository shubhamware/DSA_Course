package com.company;

public class Q5 {
    public static void main(String[] args) {
        patternQ5(5);

    }
    static void patternQ5(int size){
        int alphabet = 65;
        int rows = 5;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char)(alphabet + j -1) + " ");
            }
            System.out.println();
        }
    }




}
