package com.cperbony.logical_puzzle;

public class FizzBuzzRecursion {

    public static void main(String[] args) {
        System.out.println("Recursion Solution");

        System.out.println(" ");
        System.out.println("Recursive Solution");
        RecursiveSolution(100);
    }

    private static void RecursiveSolution(int n) {
        String text;
        if (n < 1)
            return;

        if (n % 15 == 0)
            text = "FizzBuzz";
        else if (n % 3 == 0)
            text = "Fizz";
        else if (n % 5 == 0)
            text = "Buzz";
        else
            text = Integer.toString(n);

        System.out.println(text);
        RecursiveSolution(n - 1);

    }
}
