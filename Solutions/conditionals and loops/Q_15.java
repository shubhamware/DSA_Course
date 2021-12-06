package com.company;

import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=in.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
}
