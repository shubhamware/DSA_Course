package com.company;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Number of classes held");
        int classes=in.nextInt();
        System.out.println("Number of classes attended");
        int attended=in.nextInt();

        float percentage;

        percentage=((attended*100)/classes);

        System.out.println("Overall Percentage attendance is:"+ percentage);


        if(percentage<75){
            System.out.println("You have medical issue (Y or N) ");
            char choice=in.next().charAt(0);
            if(choice == 'Y' || choice == 'y'){
                System.out.println("Provide medical certificate then you are able to sit in exam");
            }
            else{
                System.out.println("You are not able to sit in exam");
            }

        }else{
            System.out.println("You are able to sit in exam");

        }
    }
}
