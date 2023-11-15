/*
Check if the given string is palindrome or not. Palindrome means after reversing a string, it
will be same.
Input: Civic
Output: true
Input: One
Output: false
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public static void main(String args[]) {
        String input1 = "Civic";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + isPalindrome(input1));

        String input2 = "One";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + isPalindrome(input2));
    }
}