package com.company;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter person1 Age:");
        int person1=in.nextInt();
        System.out.print("Enter person2 Age:");
        int person2=in.nextInt();
        System.out.print("Enter person3 Age:");
        int person3=in.nextInt();

        // finding the oldest one
        if(person1 > person2 && person1 > person3){
            System.out.println("oldest person is person1 and his age is:"+" "+person1);
        }
        else if(person2 > person1 && person2 > person1){
            System.out.println("oldest person is person2 and his age is:"+" "+person2);
        }
        else if(person3 > person1 && person3>person2){
            System.out.println("oldest person is person3 and his age is:"+" "+person3);
        }

        // find the youngest one
        if(person1 < person2 && person1 < person3){
            System.out.println("Youngest person is person1 and his age is:"+" "+person1);
        }
        else if(person2 < person1 && person2 < person3){
            System.out.println("Youngest person is person2 and his age is:"+" "+person2);
        }
        else if(person3 < person1 && person3 < person2){
            System.out.println("Youngest person is person3 and his age is:"+" "+person3);
        }

    }
}
