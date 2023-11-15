/*
Write a program that will breakdown the amount and count notes for any given amount. Here is
the notes in the given array:
notes=[1000,500,200,100,50,20,10,5,2,1]
Example 1: User input: 575
Output:
500 1
50 1
20 1
5 1
Example 2: User input: 2148
Output:
1000 2
100 1
20 2
5 1
2 1
1 1
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class NoteBreakdown {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("User Input: ");
        int amount = scanner.nextInt();
        System.out.print("Output: ");
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                System.out.println(notes[i] +" "+ count);
                amount = amount % notes[i];
            }
        }
    }
}