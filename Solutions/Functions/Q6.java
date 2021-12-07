package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        prime_number(num);

    }
    static void prime_number(int num){
        boolean isPrime=true;

        for(int i=2;i<num;i++){
            if(num % i == 0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" "+"is a prime number");
        }
        else{
            System.out.println(num+" "+"is not a prime number");

        }

    }
}
