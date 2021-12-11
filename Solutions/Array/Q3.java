package com.company;

public class Q3 {
    public static void main(String[] args) {
        int[] arr={5,6,-4,9,3};

        int max=0;

        for(int i=0;i<arr.length;i++){
            max+=arr[i];
        }
        System.out.println(max);
    }
}
