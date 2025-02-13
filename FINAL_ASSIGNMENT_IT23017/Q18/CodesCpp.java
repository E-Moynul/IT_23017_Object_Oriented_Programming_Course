///it23017


package com.mycompany.codes.cpp;

import java.util.* ;
import java.math.* ;
import java.util.Random;

public class CodesCpp {

    int[] predefinedArray;
    int maxValue;
    Random random;

    public CustomRandomGenerator(int[] predefinedArray, int maxValue) {
        if (predefinedArray == null || predefinedArray.length == 0) {
            throw new IllegalArgumentException("Predefined array cannot be null or empty.");
        }
        this.predefinedArray = predefinedArray;
        this.maxValue = maxValue;
        this.random = new Random();
    }

    public int nextInt() {
        long currentTime = System.currentTimeMillis();
        int index = (int) (currentTime % predefinedArray.length);
        int randomNumber = (int) ((currentTime * predefinedArray[index]) % maxValue);

        return randomNumber;
    }

    public int nextInt(int bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("Bound must be positive.");
        }
        return Math.abs(nextInt() % bound); // Use Math.abs to ensure positive results
    }

    public static void main(String[] args) {
        int[] myArray = {7, 13, 2, 19, 5};
        CustomRandomGenerator generator = new CustomRandomGenerator(myArray, 100);

        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt());
        }

        System.out.println("\nNumbers within a specific bound (30):");
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.nextInt(30));
        }
    }
}
