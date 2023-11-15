/*
Take any number as input and print the reverse of the number
input: 12345
output: 54321
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int numbers = scanner.nextInt();
        int reversed = 0;
        while (numbers != 0) {
            int digit = numbers % 10;
            reversed = reversed * 10 + digit;
            numbers = numbers / 10;
        }
        System.out.print("Output: " + reversed);
    }
}