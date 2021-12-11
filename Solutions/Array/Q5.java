package com.company;

public class Q5 {
    public static void main(String[] args) {
        int[] arr={-5,10,-49,85,5,63,7};
        int target=5;
        boolean ans=search_element(arr,target);
        System.out.println(ans);

    }
    static boolean search_element(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
