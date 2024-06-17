package org.example;

import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {

    }

    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
        return LongStream.range(fromIncl, toExcl)
                         .reduce(0,(long a, long b) -> (a + b * b));

// Another solution
//        return LongStream.range(fromIncl, toExcl)
//                .map(x -> x * x)
//                .sum();
    }
}