package com.company;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        int power=in.nextInt();
        int p=1;

        for(int i=1;i<=power;i++){
            p=p*number;
        }
        System.out.println(p);
    }
}
