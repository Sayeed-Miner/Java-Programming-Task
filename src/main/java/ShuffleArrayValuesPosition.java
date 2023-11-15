/*
Write a program that will shuffle (values will randomly change their position) from the given
array
numbers=[1,2,3,4,5,6,7,8,9,0]
random output: 3 5 0 1 7 9 6 4 2 8

*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class ShuffleArrayValuesPosition {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        shuffle(numbers);
        System.out.print("Random Output: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void shuffle(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}