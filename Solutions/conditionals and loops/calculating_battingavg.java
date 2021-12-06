package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class calculating_battingavg {
    public static void main(String[] args) {
        System.out.println("Players average in 5 match ODI series");
        Scanner in=new Scanner((System.in));
        System.out.println("Enter 1 ODI match runner");
        int first= in.nextInt();
        System.out.println("Enter 2 ODI match runner");
        int second= in.nextInt();
        System.out.println("Enter 3 ODI match runner");
        int third= in.nextInt();
        System.out.println("Enter 4 ODI match runner");
        int fourth= in.nextInt();
        System.out.println("Enter 5 ODI match runner");
        int fifth= in.nextInt();

        float average=(first+second+third+fourth+fifth)/5f;

        System.out.println("The average of batseman in ODI series is:"+average);

    }
}
