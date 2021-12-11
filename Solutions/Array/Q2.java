package com.company;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={20,45,69,10,5,96};

        int minvalue=arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
        }
        System.out.println(minvalue);

    }
}
