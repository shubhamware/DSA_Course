package com.company;

public class Q4 {
    public static void main(String[] args) {
        int[] arr={10,9,8,25,36};
        int target=25;
        int ans=find_index(arr,target);
        System.out.println(target +" is at"+" "+ans+" rd "+"index position");
    }
    static int find_index(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
