package com.company;

import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=0;
        char choice;
        int even=0;
        int odd=0;


        do {

            int number = in.nextInt();

            while (number > 0) {
                int rem = number % 10;
                if (rem % 2 == 0) {
                    even += rem;
                } else {
                    odd += rem;
                }
                number = number / 10;
            }
            System.out.print("Do you want to continue y/n? ");
            choice =in.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);

    }
}
