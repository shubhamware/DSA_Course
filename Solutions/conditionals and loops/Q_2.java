package com.company;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("a:");
        int a= in.nextInt();
        System.out.println("b:");
        int b= in.nextInt();
        System.out.println("c:");
        int c= in.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("It is a triangle");
        }else{
            System.out.println("it is not a triangle");
        }


    }
}
