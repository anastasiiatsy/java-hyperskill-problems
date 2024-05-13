import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        extractWords(text);
    }

    public static void extractWords(String text) {
        Pattern programPattern = Pattern.compile("program\\w*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = programPattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}