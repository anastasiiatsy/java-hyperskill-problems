package org.example;


public class Main {
    public static void main(String[] args) {
        TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a != b && a != c && b != c;
    }
}