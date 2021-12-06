package com.company;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int positive=0;
        int negative=0;
        int zeros=0;

        char ch;

        do{
            int number= in.nextInt();

            if(number>0){
                positive++;
            }else if(number<0){
                negative++;
            }
            else{
                zeros++;
            }
            System.out.println("Do you want to continue y/n? ");
            ch=in.next().charAt(0);

        } while (ch =='Y' || ch == 'y');

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zeros);


    }
}
