/*
Find out the duplicate numbers in the given array and in which position they are found.
numbers=[1,2,3,1,2,4,5,6,4]
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class DuplicateNumberPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};
        Map<Integer, Integer> duplicateCounts = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (duplicateCounts.containsKey(numbers[i])) {
                System.out.println("Duplicate value: " + numbers[i] + " at index " + i);
            } else {
                duplicateCounts.put(numbers[i], i);
            }
        }
    }
}