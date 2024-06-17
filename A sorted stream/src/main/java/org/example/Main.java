package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sortAndPrint(Arrays.stream(scanner.nextLine().split("\\s+")));
    }

    public static void sortAndPrint(Stream<String> wordStream) {
        wordStream.sorted().forEach(System.out::println);
    }
}