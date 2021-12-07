package com.company;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int ans=reverse(number);
        System.out.println(ans);

    }
    static int reverse(int number){
        int ans=0;
        while(number>0){

            int rem=number % 10;

            ans=(ans*10)+rem;

            number=number/10;
        }
        return ans;
    }

}
