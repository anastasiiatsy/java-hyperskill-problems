import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        findPasswords(input);

    }

    public static void findPasswords(String input) {
        Pattern password = Pattern.compile("(password)(:|\\s+)\\s*([A-Za-z0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = password.matcher(input);
        boolean found = false;
        while (matcher.find()) {
            found = true;
            System.out.println(matcher.group(3));
        }
        if (!found) {
            System.out.println("No passwords found.");
        }
    }
}