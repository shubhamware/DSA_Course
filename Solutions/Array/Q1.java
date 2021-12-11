package com.company;

public class Q1 {

    public static void main(String[] args) {
        int[] arr={20,45,69,10,5,96};

        int maxvalue=arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        System.out.println(maxvalue);

    }
}
