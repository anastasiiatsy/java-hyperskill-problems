package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        System.out.println(sum(provider.getValues()));
//        System.out.println(provider.getValues().stream().mapToInt(opt -> opt.orElse(0)).sum());
    }

    public static int sum(List<Optional<Integer>> opts) {
        return opts.stream().filter(optional -> optional.isPresent())
                  .mapToInt(optional -> optional.orElse(0))
                  .sum();
    }
}