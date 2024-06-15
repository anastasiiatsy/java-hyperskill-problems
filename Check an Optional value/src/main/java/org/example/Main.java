package org.example;


public class Main {

    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        printValue(provider);

    }

    public static void printValue(ValueProvider provider) {
        provider.getValue().ifPresent(System.out::println);
    }
}