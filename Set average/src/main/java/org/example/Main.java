package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.averagingDouble;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<Integer> integerStream = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt);
        System.out.println(avgOnSet(integerStream));
    }

    public static Double avgOnSet(Stream<Integer> numbers) {
        return numbers.distinct()
                      .collect(averagingDouble(Double::valueOf));

// Other solutions
//        return numbers.collect(Collectors.toSet())
//                .stream()
//                .collect(Collectors.averagingInt(Integer::intValue));
//
//        return numbers.mapToInt(i -> i).distinct().summaryStatistics().getAverage();
    }
}