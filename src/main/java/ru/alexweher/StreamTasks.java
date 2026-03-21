package ru.alexweher;

import java.util.List;

public class StreamTasks {

    List<Integer> list = List.of(1, 2, 3, 4, 5, 6);


    public static List<Integer> getEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .toList();
    }

    public static List<Integer> getSquaresOfEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .toList();
    }

    public static int getMax(List<Integer> list) {
      return  list.stream()
                .max(Integer::compareTo)
              .orElseThrow();
    }

    public static long countGreaterThan(List<Integer> list) {
        return list.stream()
                .filter(x -> x > 3)
                .count();
    }

    public static int sum(List<Integer> list) {
        return list.stream()
                .mapToInt(x -> x)
                .sum();
    }

    public static int sumSquaresOfEven(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();
    }
}