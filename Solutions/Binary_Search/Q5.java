package com.company;

public class Q5 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,2,2};
        int target=2;
        int ans=first_occurrence(arr,target);
        System.out.println("fist occurrence at index"+" "+ans);
        int ans1=second_occurrence(arr,target);
        System.out.println("Second occurrence at index"+" "+ans1);


    }
    static int first_occurrence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;

    }



    static int second_occurrence(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }

        }
        return ans;
    }

}
