/*
Write a program that will take integer numbers as user input continuously and print the sum
of numbers until user input q from the keyboard. When user input q, program will be quit.
If user inputs another character, then the program will ask to input the number again.
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class ContinuousSum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            String input;
            boolean flag = true;
            while (flag) {
                System.out.print("Enter integer numbers or input 'q' to quit: ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    flag = false;
                } else {
                    try {
                        int number = Integer.parseInt(input);
                        sum += number;
                    } catch (NumberFormatException e) {
                        System.out.println("Not a integer number");
                    }
                }
            }
            System.out.println("The Sum of All Numbers: " + sum);
    }
}