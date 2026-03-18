package ru.alexweher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArraysTasks arraysTasks = new ArraysTasks();

        System.out.println("Index of max: " + arraysTasks.findFirstMaxIndexOfArray());
        System.out.println("Second max value: " + arraysTasks.findSecondMaxValue());
        System.out.println("Sum: " + arraysTasks.sumAllElements());
        System.out.println("Average: " + arraysTasks.averageAllElements());
        System.out.println("Even count: " + arraysTasks.countEvenElements());

        int[] arr = {1, 2, 3, 2, 1};
        arraysTasks.reverseArray(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));

        System.out.println("Is palindrome: " + arraysTasks.isPalindrome(new int[]{1,2,3,2,1}));

        System.out.println("Sliding window sums: " +
                arraysTasks.sumOfSubArray(new int[]{1,2,3,4,5}, 3));
    }
}