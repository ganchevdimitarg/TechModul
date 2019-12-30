import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Dates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([\\/.-])(?<mouth>[A-Za][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){

            //Така вземаме регекс групите и ги присвояваме на стрингое
            String day = matcher.group("day");
            String mouth = matcher.group("mouth");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, mouth, year);
        }
    }
}
