package com.company;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a start number");
        int start=in.nextInt();
        System.out.println("Enter end number");
        int end=in.nextInt();

        float sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        float avg=(sum)/end;
        System.out.println("AVERAGE IS:"+" "+avg);
    }
}
