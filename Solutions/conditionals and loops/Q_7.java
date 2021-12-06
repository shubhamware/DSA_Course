package com.company;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int basic=in.nextInt();
        char grade=in.next().charAt(0);

        float hra=(20/100f)*basic;
        float da=(50/100f)*basic;
        float pf=(11/100f)*basic;

        int allow=0;
        if(grade == 'A'){
            allow=1700;
        }
        else if(grade=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }

        float total_salary=basic+hra+da+allow-pf;
        System.out.println(Math.round(total_salary));
    }
}
