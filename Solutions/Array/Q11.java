package com.company;

public class Q11 {
    public static void main(String[] args) {
        int[][] c=new int[3][3];
        int[][] a={
                {1,2,3},
                {4,5,6}

        };
        int[][] b={
                {7,8,9},
                {10,12,13}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
