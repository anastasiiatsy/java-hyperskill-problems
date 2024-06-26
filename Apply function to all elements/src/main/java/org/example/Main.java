package org.example;

import java.util.*;
import java.util.function.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        applyFunction(array,
                "lower".equals(method) ? String::toLowerCase :
                        "upper".equals(method) ? String::toUpperCase :
                                "new".equals(method) ? String::new :
                                        "trim".equals(method) ? String::trim : String::intern);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static <T> void applyFunction(T[] array, Function<T, T> func) {
        // write your code here
        for (int i = 0; i < array.length; i++) {
            T element = func.apply(array[i]);
            array[i] = element;
        }
    }
    // another solution
//     Arrays.setAll(array, i -> func.apply(array[i]));
}