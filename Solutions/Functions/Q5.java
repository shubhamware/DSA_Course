package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        int ans=greatest_number(num1,num2,num3);
        System.out.println(ans);

    }
    static int greatest_number(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num1 && num2>num3){
            return num2;
        }
        else {
            return num3;
        }
    }
}
