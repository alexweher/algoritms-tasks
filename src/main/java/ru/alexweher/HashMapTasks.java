package ru.alexweher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTasks {

    public static Map<Integer,Integer> countFrequency(int [] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        return map;
    }


    public static List<Integer> getOnlyUnique(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        // считаем частоты
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // берём только те, у кого count == 1
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }


    public static int mostFrequent(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int result = -1;

        for (int num : map.keySet()) {
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                result = num;
            }
        }

        return result;
    }



    List<String> list = List.of("cat", "car", "dog", "door");

    List<Integer> listInt = List.of(10, 21, 32, 43);

    Map<Character, List<String>> result = list.stream()
            .collect(Collectors.groupingBy(s -> s.charAt(0)));


    Map<Boolean, List<Integer>> res = listInt.stream()
            .collect(Collectors.groupingBy(x -> x % 2 == 0));


}
