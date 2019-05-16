package com.cperbony.logical_puzzle;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("For Loop Solution");

        String text;
        for (int i = 100; i >= 1; i--) {
            if (i % 15 == 0)
                text = "FizzBuzz";
            else if (i % 3 == 0)
                text = "Fizz";
            else if (i % 5 == 0)
                text = "Buzz";
            else
                text = Integer.toString(i);

            System.out.println(text);
        }
    }
}
