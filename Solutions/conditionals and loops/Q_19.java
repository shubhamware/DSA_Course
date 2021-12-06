package com.company;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Number of classes held");
        int classes=in.nextInt();
        System.out.println("Number of classes attended");
        int attended=in.nextInt();

        float percentage;

        percentage=((attended*100)/classes);

        System.out.println("Overall Percentage attendance is:"+ percentage);

        if(percentage>=75){
            System.out.println("You are allow to sit in exam");
        }
        else{
            System.out.println("You are not allow to sit in exam");
        }



    }
}
