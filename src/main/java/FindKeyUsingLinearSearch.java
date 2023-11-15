/*
Write a program that will find your key is found in the given array using linear search method
numbers=[1,6,9,3,5,4,7]
key=5
*/
import java.io.*;
import java.lang.*;
import java.util.*;

public class FindKeyUsingLinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1,6,9,3,5,4,7};
        int key = 5;
        int result = linearSearch(numbers, key);
        if(result == -1) {
            System.out.println("Key is not found in array");
        } else {
            System.out.println("Key=" +key+ " found at index " +result);
        }
    }
    public static int linearSearch(int[] array, int key) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}