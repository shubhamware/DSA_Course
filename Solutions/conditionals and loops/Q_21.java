package com.company;


import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter Employee Salary:");
        int salary= in.nextInt();

        System.out.println("Enter year of service:");
        int service=in.nextInt();

        int bonus=(salary*5)/100;

        if(service>5){
            System.out.println("Bonus amount:"+" "+bonus);
        }
        else{
            System.out.println("Your year of service is not more than 5 years so You got 0 bonus");
        }
    }



}
