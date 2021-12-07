package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int ans=sum(num1,num2);
        System.out.println("sum is:"+" "+ans);
    }
    static int sum(int num1,int num2){
        int addition=num1+num2;
        return addition;
    }
}
