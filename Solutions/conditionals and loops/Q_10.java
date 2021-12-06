package com.company;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysinMonth=0;
        String MonthName = "Invalid";

        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        System.out.println("Enter the Year: ");
        int year = sc.nextInt();

        if(month==1){
            MonthName = "January";
            daysinMonth = 31;
        }
        else if (month==2){
            MonthName = "February";
            if((year%400==0) || ((year%100!=0) && (year%4==0))){
                daysinMonth = 29;
            }
            else {
                daysinMonth = 28;
            }
        }
        else if(month==3){
            MonthName = "March";
            daysinMonth = 31;
        }
        else if(month==4){
            MonthName = "April";
            daysinMonth = 30;
        }
        else if(month==5){
            MonthName = "May";
            daysinMonth = 31;
        }else if(month==6){
            MonthName = "June";
            daysinMonth = 30;
        }else if(month==7){
            MonthName = "July";
            daysinMonth = 31;
        }else if(month==8){
            MonthName = "August";
            daysinMonth = 31;
        }else if(month==9){
            MonthName = "September";
            daysinMonth = 30;
        }else if(month==10){
            MonthName = "October";
            daysinMonth = 31;
        }else if(month==11){
            MonthName = "November";
            daysinMonth = 30;
        }else if(month==12){
            MonthName = "December";
            daysinMonth = 31;
        }

        System.out.println(MonthName+" "+year+" has "+daysinMonth+" days\n");



    }

}
