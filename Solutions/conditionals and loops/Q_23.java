package com.company;

public class Q_23 {
    public static void main(String[] args) {
        int number = 10, first = 0, second = 1;
        System.out.println("Fibonacci Series till " + number + " terms:");

        for (int i = 1; i <= number; ++i) {
            System.out.print(first + ", ");

            // compute the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;

        }
    }
}
