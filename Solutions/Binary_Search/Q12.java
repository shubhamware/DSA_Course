package com.company;

public class Q12 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,0,1,2,3};
        int ans=find(arr);
        System.out.println(ans);

    }
    static int find(int[] arr){
        int min=Peak(arr);
        int BS1=Binary_search(arr,5,0,Peak(arr)-1);
        int BS2=Binary_search2(arr,5,Peak(arr),arr.length-1);
        if(BS1!=-1){
            return BS1;
        }else if(BS2 !=-1){
            return BS2;

        }
        return -1;
    }
    static int Peak(int[] arr){
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
    static int Binary_search(int[] arr,int target,int start,int end){
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
    static int Binary_search2(int[] arr,int target,int start,int end){
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
