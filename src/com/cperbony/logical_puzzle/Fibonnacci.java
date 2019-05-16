package com.cperbony.logical_puzzle;

public class Fibonnacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci Loop Solution");

        int number1 = 0;
        int number2 = 1;

        System.out.println("Número 1 =  " + number1);
        System.out.println("Número 2 = " + number2);

        for (int i = 0; i < 15 ; i++) {
            int next = number1 + number2;
            number1 = number2;
            number2 = next;

            System.out.println("Número 1 =  " + number1);
            System.out.println("Número 2 = " + number2);


            System.out.println(number2);

        }

    }
}
