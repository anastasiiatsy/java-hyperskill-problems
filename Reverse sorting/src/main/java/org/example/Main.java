package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static void sortStrings(List<String> strings) {
//        Option #1
//        Collections.sort(strings);
//        Collections.reverse(strings);

//        Option #2
//        strings.sort((s1, s2) -> {
//            return s2.compareTo(s1);
//        });

//        Option #3
        strings.sort(Comparator.reverseOrder());
    }
}