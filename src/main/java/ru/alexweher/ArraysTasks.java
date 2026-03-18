package ru.alexweher;

import java.util.*;

public class ArraysTasks {

    int[] arr = {1, 5, 2, 5, 3};

    public int findFirstMaxIndexOfArray () {

        if (arr == null || arr.length == 0)
            return -1;

        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        return maxIndex;
    }

    public int findSecondMaxValue () {

        if (arr == null || arr.length < 2) {
            return -1;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num < max1 && num > max2) {
                max2 = num;
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }
        return max2;
    }


    public int sumAllElements () {

        int sumArr = 0;

        for (int i = 0; i < arr.length; i++)
            sumArr = sumArr + arr[i];
        return sumArr;

    }


    public double averageAllElements () {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sumArr = 0;

        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }

        return (double) sumArr / arr.length;
    }


    public int countEvenElements () {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public void reverseArray ( int[] arr){

        if (arr == null || arr.length < 2)
            return;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }

    public boolean isPalindrome(int[] arr) {

        if (arr == null || arr.length < 2)
            return true;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] != arr[right])
                return false;

            left++;
            right--;
        }

        return true;
    }

    public List<Integer> sumOfSubArray(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < k || k <= 0) return result;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        result.add(windowSum);

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            result.add(windowSum);
        }

        return result;
    }


    public int sumMatrix(int [][] matrix) {

        if (matrix==null || matrix.length==0)
            return 0;

        int sum=0;

        for (int i=0; i< matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                sum=matrix[i][j] + sum;

            }
        }
        return sum;
    }



    public int maxInMatrix(int[][] matrix) {

        if (matrix==null || matrix.length==0)
            return Integer.MIN_VALUE;

         int max= matrix[0][0];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] >max){
                    max=matrix[i][j];
                }

            }

        }
        return max;

    }

    public int[] sumEachRow(int[][] matrix) {

        if (matrix==null || matrix.length==0)
            return new int[0];

        int[] result = new int[matrix.length];

        for (int i = 0; i <matrix.length ; i++) {

            int rowSum=0;

            for (int j = 0; j <matrix[i].length ; j++) {

                rowSum=matrix[i][j]+rowSum;

            }

            result[i]=rowSum;

        }

        return result;
    }


    public int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{-1, -1};
    }

    public boolean containsDuplicate(int [] arr) {

        Set<Integer> unique = new HashSet<>();

        for (int i =0; i< arr.length; i++) {
            if (unique.contains(arr[i])){
                return true;
            }else{
                unique.add(arr[i]);
            }
        }
        return false;
    }

    public static Character firstNonRepeatingCharacter(String s) {

        if (s==null || s.isEmpty()) {
            return null;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (frequencyMap.containsKey(ch)){
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (frequencyMap.get(ch) == 1){
                return ch;
            }
        }
       return null;
    }


    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1 ,arr2);
    }


    public int maxProfit(int [] prices) {

        if ( prices == null || prices.length < 2 )
            return 0;

        int minPrice = prices[0];

        int maxProfit = 0;

        for (int i = 0; i< prices.length; i++) {

            if (prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }


    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}

