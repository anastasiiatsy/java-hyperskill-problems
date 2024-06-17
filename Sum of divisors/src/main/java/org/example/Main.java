package org.example;

import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(sum(a, b, n, m));
    }

    public static int sum(int a, int b, int n, int m) {
        return IntStream.rangeClosed(a,b)
                        .filter(number -> number % n == 0 || number % m == 0)
                        .sum();
    }
}