import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine().toLowerCase();
        int numHoliday = Integer.parseInt(scanner.nextLine());
        int numWeek = Integer.parseInt(scanner.nextLine());

        double days = (((numHoliday * 2.0) / 3) + numWeek + (((48 - numWeek) * 3.0) / 4));

        if (year.equals("normal")) {
            System.out.println((int) Math.floor(days));
        } else if (year.equals("leap")) {
            System.out.println((int) Math.floor((days * 0.15) + days));
        }
    }
}