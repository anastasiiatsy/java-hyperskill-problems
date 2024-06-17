package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> list = stream.collect(Collectors.toList());
        minMaxConsumer.accept(list.stream().min(order).orElse(null), list.stream().max(order).orElse(null));
    }
}