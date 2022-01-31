package com.company;

public class Another_Method_Q6 {
    public static void main(String[] args) {
        patternQ6(5);
    }
    static void patternQ6(int size){
        for(int row=0;row<2*size;row++){
            int column=row >size ? 2 * size-row:row;

            for(int col=0;col< column;col++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
