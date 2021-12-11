package com.company;

public class Q8 {
    public static void main(String[] args) {
        int[] arr={-12,15,32,19,9,21};
        int target=19;
        boolean ans=find_element_inrange(arr,target,0,4);
        System.out.println(ans);

    }
    static boolean find_element_inrange(int[] arr,int target,int start,int end){
        for(int i=start;i<end;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
