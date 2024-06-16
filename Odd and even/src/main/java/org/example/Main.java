package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
        odd.sort(Integer::compareTo);
        even.sort(Comparator.reverseOrder());
        odd.addAll(even);

// Other solutions
//        numbers.sort(Comparator
//                .comparingInt((ToIntFunction<Integer>) x -> (x % 2) == 0 ? 1 : -1)
//                .thenComparingInt((ToIntFunction<Integer>) x -> (x % 2) == 0 ? -x : x));
//        return numbers;
//        List<Integer> odd = numbers.stream()
//                .filter(x -> x % 2 != 0)
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList());
//
//        odd.addAll(numbers.stream()
//                .filter(x -> x % 2 == 0)
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList()));
        return odd;
    }
}