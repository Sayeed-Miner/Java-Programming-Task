/*
Generate random 10 integer numbers in an array and print out all the numbers from array and
also print the max and min number from the array
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class RandomNumbersMaxMIn {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(numbers);
        System.out.println("Random 10 Integer Numbers: " + Arrays.toString(numbers));
        System.out.println("Min Number in Array: " + numbers[0]);
        System.out.println("Max Number in Array: " + numbers[numbers.length - 1]);
    }
}