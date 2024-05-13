import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printBigNumbers(input);
    }

    public static void printBigNumbers(String input) {
        Pattern pattern = Pattern.compile("[0-9]{10,}");
        Matcher matcher = pattern.matcher(input);
        List<String> bigNumbers = new ArrayList<>();

        while (matcher.find()) {
            bigNumbers.add(matcher.group());
        }

        for (String number : bigNumbers) {
            System.out.println(number + ":" + number.length());
        }

//        Another solution
//        Matcher matcher = Pattern.compile(
//                "\\d{10,}"
//        ).matcher(text);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group() + ":" + (matcher.end() - matcher.start()));
//        }
    }
}