package org.example;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Optional<String> optAddress = AddressBook.getAddressByName(name);
        printAddress(optAddress, name);

    }

    public static void printAddress(Optional<String> optAddress, String name) {
        optAddress.ifPresentOrElse(s -> System.out.println(name + " lives at " + s),
                                  () -> System.out.println("Unknown"));
    }
}