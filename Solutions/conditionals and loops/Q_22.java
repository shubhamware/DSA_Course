package com.company;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n= in.nextInt();

        int first=0;
        int second=1;
        int count=2;

        while(count<=n){
            int next=second;
            second=second+first;
            first=next;
            count++;

        }
        System.out.println(second);

    }
}
