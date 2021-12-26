package com.company;

public class Q10 {
    public static void main(String[] args) {
        int[] arr={2,4,10,10,10,18,20};
        int target=10;
        int ans=find_occurrence(arr,target);
        System.out.println(ans);
    }
    static int find_occurrence(int[] arr,int target){
        int first=first_Occurrence(arr,target);
        int last=Last_Occurrence(arr,target);
        int occurrence= (last - first) + 1;
        return occurrence;
    }


    static int first_Occurrence(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;

    }
    static int Last_Occurrence(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
