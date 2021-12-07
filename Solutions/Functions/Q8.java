package com.company;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        armstrong_number(num);
    }
    static void armstrong_number(int num){
        int orignal_num=num;
        int sum=0;

        while(orignal_num>0){
            int rem=orignal_num % 10;
            int power=rem*rem*rem;
            sum=sum+power;
            orignal_num=orignal_num/10;
        }
        //System.out.println(sum);
        if(sum==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }


    }
}
