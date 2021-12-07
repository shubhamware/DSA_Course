package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int age=in.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age>18){
            System.out.println("He/she is eligible to vote");
        }
        else{
            System.out.println("He/she is not eligible to vote");
        }
    }
}
