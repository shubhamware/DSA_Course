package com.company;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Bubble(int[] arr){

        for(int i=0;i<arr.length;i++){

            for(int j=1;j<arr.length-i;j++){
                //
                // compare two adjacent elements
                if(arr[j] <arr[j-1]){
                    // Swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
