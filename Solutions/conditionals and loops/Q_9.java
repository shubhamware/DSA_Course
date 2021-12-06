package com.company;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter orignal price:");
        float price=in.nextInt();
        System.out.print("Enter discount percentage in %:");
        float discount_percentage=in.nextInt();
        float sav1 = discount_percentage/100;
        int saving= (int) (price*sav1);

        float discount=price-saving;

        System.out.println("discount value is:"+" " +discount);




    }
}
