package org.example;

import java.util.Comparator;
import java.util.List;

public class Utils {
    public static void sortUsers(List<User> users) {
        users.sort(Comparator.comparing(User::getName)
             .thenComparing(Comparator.comparing(User::getAge).reversed()));
    }
}
