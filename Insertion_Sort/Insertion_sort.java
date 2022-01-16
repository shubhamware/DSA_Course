package com.company;

import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={12,31,25,8,32,17};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion (int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
