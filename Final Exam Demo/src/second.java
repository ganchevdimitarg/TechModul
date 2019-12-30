import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encrypted = scanner.nextLine();
        String[] substrings  = scanner.nextLine().split(" ");

        Pattern patternOne = Pattern.compile("[d-z{}#|]+");
        Matcher matcherOne = patternOne.matcher(encrypted);

        //.matches() при съвпадение на pattern в текста връща false,
        //ако няма съвпадение, връща true
        String second = "";
        if (matcherOne.matches()) {
            for (int i = 0; i < encrypted.length(); i++) {
                int n = encrypted.charAt(i) - 3;
                second += (char) n;
            }
            String finalString = second.replaceAll(substrings[0], substrings[1]);
            System.out.println(finalString);
        } else {
            System.out.println("This is not the book you are looking for.");
        }
    }
}
