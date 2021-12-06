package com.company;

import java.util.Scanner;

public class CBSE_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter a marks of student for each subjects:");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Subj1 marks");
        int subj1=in.nextInt();
        System.out.println("Enter a Subj2 marks");
        int subj2=in.nextInt();
        System.out.println("Enter a Subj3 marks");
        int subj3=in.nextInt();
        System.out.println("Enter a Subj4 marks");
        int subj4=in.nextInt();
        System.out.println("Enter a Subj5 marks");
        int subj5=in.nextInt();

        float a=(subj1+subj2+subj3+subj4+subj5)/500f;
        float percentage=a*100f;
        System.out.println("formatted number is %.2f" + percentage);



    }
}
