package org.example;

import java.util.*;
import java.util.function.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Predicate<Integer> isDivisibleBy3And5 = x -> x % 3 == 0 && x % 5 == 0;

        System.out.println(isDivisibleBy3And5.test(n));
    }



}