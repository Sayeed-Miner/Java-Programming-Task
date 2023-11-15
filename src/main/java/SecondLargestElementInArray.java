/*
Find out the second largest element of the given array
numbers=[5,3,9,7,4,1,8]
*/

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};
        int secondMax;
        secondMax = printSecondLargest(numbers);
        System.out.println("The second largest element of the given array is " + secondMax);
    }
    public static int printSecondLargest(int[] numbers) {
        int max = numbers[0];
        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }
}