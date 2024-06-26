package org.example;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine().trim());

        System.out.println(factorial(n));
    }

    public static long factorial(long n) {
            return LongStream.rangeClosed(1, n)
                    .reduce(1, (a, b) -> a * b);

    }
}