package com.company;

import java.util.Scanner;

public class Q_26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num % i ==0){
                sum+=i;
            }
        }
        if(sum == num){
            System.out.println("it's a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
