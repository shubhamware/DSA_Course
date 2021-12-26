package com.company;

public class Q7 {
    public static void main(String[] args) {
        //int[] arr={-9,-3,0,2,9,12,16,18,24};
        //int target=24;
        int[] arr={46,33,29,13,9,-1,-22};
        int target=-1;
        int ans=OrderAgnostic(arr,target);
        System.out.println(ans);

    }
    static int OrderAgnostic(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

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
