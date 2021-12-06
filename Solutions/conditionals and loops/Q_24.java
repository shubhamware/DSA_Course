package com.company;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        int count=0;
        while(number>0){
            int rem=number % 10;
            if (rem==5){
                count+=1;
            }
            number=number/10;

        }
        System.out.println(count);


    }
}
