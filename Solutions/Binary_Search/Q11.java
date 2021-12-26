package com.company;

public class Q11 {
    public static void main(String[] args) {
        int[] arr={11,12,15,18,2,5,6,8};
        int ans=Rotation_count(arr);
        System.out.println(ans);
    }
    static int Rotation_count(int[] arr){
        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<arr[mid+1]){
                end=mid-1;
            }
        }
        return -1;
    }
}
