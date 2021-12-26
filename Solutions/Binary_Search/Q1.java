package com.company;

public class Q1 {
    public static void main(String[] args) {
        int[] arr={12,25,39,42,59,62};
        int target=59;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
