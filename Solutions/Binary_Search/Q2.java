package com.company;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={18,12,10,8,6,4,2};
        int ans=Binary_search(arr,12);
        System.out.println(ans);

    }
    static int Binary_search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
}
