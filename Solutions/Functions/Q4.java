package com.company;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int ans=product(num1,num2);
        System.out.println("Product of two number is:"+" "+ans);

    }
    static int product(int num1,int num2){
        return num1*num2;
    }
}
