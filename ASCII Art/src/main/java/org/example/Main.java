package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> symbols = Arrays.asList(scanner.nextLine().split("\\s+"));
        System.out.println(asciiArt(symbols));
    }

    public static String asciiArt(List<String> symbols) {
        return symbols.stream().collect(Collectors.joining("", "(", ")"));
    }
}