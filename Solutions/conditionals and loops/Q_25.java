package com.company;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int number=in.nextInt();
        int ans=0;
        while(number>0){
            int rem=number % 10;

            ans=(ans*10)+rem;

            number=number/10;
        }
        System.out.println(ans);
    }
}
