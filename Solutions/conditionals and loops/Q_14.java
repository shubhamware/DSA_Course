package com.company;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);

        if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'){
            System.out.println("It is a Vowel.");
        }
        else{
            System.out.println("It is a Consonant.");
        }
        /* // you can also use switch statements
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");

         */

    }
}
