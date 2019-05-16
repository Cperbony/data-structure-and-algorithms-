package com.cperbony.logical_puzzle;

public class FibonnacciRecursion {

    public static void main(String[] args) {
        System.out.println("Fibonacci Recursion Solution");

        for (int i = 0; i <= 15; i++) {
            System.out.println(recursiveSolution(i));
        }
    }

    private static int recursiveSolution(int number) {
        if (number <= 1)
            return 1;

        return recursiveSolution(number - 2)
                + recursiveSolution(number - 1);
    }
}
