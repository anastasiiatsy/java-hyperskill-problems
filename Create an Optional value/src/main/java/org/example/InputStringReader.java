package org.example;

import java.util.Optional;
import java.util.Scanner;

public class InputStringReader {
    public Optional<String> getValue() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return "empty".equals(userInput) ? Optional.empty() : Optional.of(userInput);
    }
}
