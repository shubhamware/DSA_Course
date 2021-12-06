package com.company;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a year");
        int year=in.nextInt();

        if ((year % 4 == 0) && year % 100 != 0){
            System.out.println(year+" "+"is leap year");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
            System.out.println(year+" "+"is leap year");
        }

        else {
            System.out.println(year+" "+"is not a leap year");
        }

    }
}
