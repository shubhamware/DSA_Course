package com.company;

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char ch=in.next().charAt(0);

        if(ch>=97 && ch<=122){
            System.out.println("Lowercase");
        }
        else if(ch>=65 && ch<=90){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
