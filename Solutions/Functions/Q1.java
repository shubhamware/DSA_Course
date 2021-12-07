package com.company;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        boolean ans=even_odd(num);
        System.out.println(ans);

    }
    static boolean even_odd(int num){
        if(num % 2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
