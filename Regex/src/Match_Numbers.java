import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        Pattern pattern = Pattern.compile("(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s+))");
        Matcher matcher = pattern.matcher(numbers);


        List<String> num = new ArrayList<>();

        while (matcher.find()){
            num.add(matcher.group());
        }

        System.out.println(String.join(" ", num));

    }
}
