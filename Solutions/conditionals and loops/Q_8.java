package com.company;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        int even=0;
        int odd=0;

        while(num>0){
            int rem=num % 10;

            if (rem % 2 ==0){
                even+=rem;
            }else{
                odd+=rem;
            }

            num=num/10;

        }
        System.out.println(even+" "+ odd);


    }
}
