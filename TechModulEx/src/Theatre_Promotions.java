import java.util.Scanner;

public class Theatre_Promotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (day.equals("Weekday") && (0 <= age && age <= 18)) {
            System.out.println("12$");
        } else if (day.equals("Weekday") && (18 < age && age <= 64)) {
            System.out.println("18$");
        } else if (day.equals("Weekday") && (64 < age && age <= 122)) {
            System.out.println("12$");
        } else if (day.equals("Weekend") && (0 <= age && age <= 18)) {
            System.out.println("15$");
        } else if (day.equals("Weekend") && (18 < age && age <= 64)) {
            System.out.println("20$");
        } else if (day.equals("Weekend") && (64 < age && age <= 122)) {
            System.out.println("15$");
        } else if (day.equals("Holiday") && (0 <= age && age <= 18)) {
            System.out.println("5$");
        } else if (day.equals("Holiday") && (18 < age && age <= 64)) {
            System.out.println("12$");
        } else if (day.equals("Holiday") && (64 < age && age <= 122)) {
            System.out.println("10$");
        } else {
            System.out.println("Error!");
        }
    }
}
