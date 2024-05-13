import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        outputKeys(text);
    }

    public static void outputKeys(String text) {

        Pattern keyPattern = Pattern.compile("((?i)the\\s*key\\s*is)\\s+" +
              "(((?i)[aeiou?!#]+|((?i)[b-df-hj-np-tv-z0-9]+)))" +
              "[.\\s+]");
        Matcher matcher = keyPattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }

}