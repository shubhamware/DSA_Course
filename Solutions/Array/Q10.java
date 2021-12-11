package com.company;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {8,10,12,14},
                {16,18},
                {13,17,29,39}
        };
        int[] ans=two_dimensional(arr,16);
        System.out.println(Arrays.toString(ans));



    }
    static int[] two_dimensional(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
