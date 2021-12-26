package com.company;

public class Q6 {
    public static void main(String[] args) {
        int num=80;
        int ans=square_root(num);
        System.out.println(ans);
    }
    static int square_root(int num){
        int start=1;
        int end=num;
        int ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid*mid==num){
                return mid;

            }
            else if(mid*mid>num){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;
            }

        }
        return ans;

    }
}

