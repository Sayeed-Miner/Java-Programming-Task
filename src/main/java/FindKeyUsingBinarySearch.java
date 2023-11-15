/*
Write a program that will find your key is found in the given array using binary search method
numbers=[1,6,9,3,5,4,7]
key=5
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class FindKeyUsingBinarySearch {
     public static void main(String[] args) {
         int[] numbers = {1, 6, 9, 3, 5, 4, 7};
         int key = 5;
         Arrays.sort(numbers);
         boolean isKeyFound = binarySearch(numbers, key);
     }
     private static boolean binarySearch(int[] array, int key) {
         int low = 0;
         int high = array.length - 1;
         while (low <= high) {
             int mid = (low + high) / 2;
             int midValue = array[mid];
             if (midValue == key) {
                 System.out.println("Key=" +key+ " found at index " + midValue);
                 break;
             } else if (midValue < key) {
                 low = mid + 1;
             } else {
                 high = mid - 1;
             }
             if (midValue > key) {
                 System.out.println("Key is not found in array");
                 break;
             }
         }
         return false;
     }
}