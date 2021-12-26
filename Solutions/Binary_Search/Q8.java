package com.company;

public class Q8 {
    public static void main(String[] args) {
        int[] arr={2,6,9,15,14,12,8,4,1};
        int ans=Peak_Element(arr);
        System.out.println(ans);

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

}
