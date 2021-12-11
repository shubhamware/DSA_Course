package com.company;

public class Q9 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int ans=even_count(nums);
        System.out.println(ans);

    }
    static int even_count(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
        int number_of_digits=digits_in_number(num);

        return number_of_digits % 2==0;



    }

    static int digits_in_number(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}
