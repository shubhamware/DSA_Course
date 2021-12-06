package com.company;

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int x = in.nextInt();
        System.out.println("Enter breadth");
        int y = in.nextInt();
        if(x==y){
            System.out.println("It is a Square");
        }
        else {
            System.out.println("It is a Rectangle");
        }
    }

}
