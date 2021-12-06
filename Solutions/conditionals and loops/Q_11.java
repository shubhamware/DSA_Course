package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
/*A school has following rules for grading system:
Take input from user:subject: Math,Science,history,English,Sanskrit;
Find percentage;
If percentage;
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade

 */
public class Q_11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Math Mark:");
        double subj1=in.nextInt();
        System.out.println("Enter Science Mark:");
        double subj2=in.nextInt();
        System.out.println("Enter History Mark:");
        double subj3=in.nextInt();
        System.out.println("Enter English Mark:");
        double subj4=in.nextInt();
        System.out.println("Enter Sanskrit Mark:");
        double subj5=in.nextInt();


        double per=(subj1+subj2+subj3+subj4+subj5)/500;

        double percentage=per*100;



        if(subj1>=40 && subj2>=40 && subj3>=40 &&subj4>=40 &&subj5>=40){
            if(percentage>80){
                System.out.println(percentage+"%"+" "+"A");
            }
            else if(percentage>60 && percentage<=80){
                System.out.println(percentage+"%"+" "+"B");
            }
            else if(percentage>50 && percentage<=60){
                System.out.println(percentage+"%"+" "+"C");
            }
            else if (percentage>40 && percentage<=50){
                System.out.println(percentage+"%"+" "+"D");
            }
            else if(percentage>30 && percentage<=40){
                System.out.println(percentage+"%"+" "+"E");
            }
            else{
                System.out.println(percentage+"%"+" "+"F");
            }
        }
        else{
            System.out.println("You are fail in one of subject so we are not displaying your Percentile and Grade");
        }

    }
}
