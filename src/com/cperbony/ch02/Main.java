package com.cperbony.ch02;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 55;
        intArray[4] = 1;
        intArray[5] = -22;
        intArray[6] = 7;

        int index = -1;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }

        }

        System.out.println("Index :" + index);


    }
}
