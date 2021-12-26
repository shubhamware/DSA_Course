package com.company;

public class Q9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int peak=Peak_Element(arr);
        int Firstpart=OrderAgnostic(arr,target,0,peak);
        if(Firstpart !=-1){
            return Firstpart;
        }
        return OrderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int Peak_Element(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }

    static int OrderAgnostic(int[] arr,int target,int start,int end){


        // find the array is in sorted ascending or descending order

        boolean isAscending;
        if(arr[start]<arr[end]){
            isAscending=true;
        }else{
            isAscending=false;
        }

        while(start<=end){
            int mid=start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }

            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
