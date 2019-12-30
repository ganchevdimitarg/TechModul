import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Days_After_Birth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String input = scanner.nextLine();
        LocalDate thousant = LocalDate.parse(input, formatter);
        System.out.println(formatter.format(thousant.plusDays(999)));
    }
}

