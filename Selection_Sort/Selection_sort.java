package com.company;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={32,24,12,22,10};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex !=i){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }

    }
}
