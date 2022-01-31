package com.company;

public class Q7 {
    public static void main(String[] args) {
        patternQ7(5);

    }
    static void patternQ7(int size){
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
