import java.util.Scanner;

public class Trade_Comissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine().toLowerCase();
        double salary = Double.parseDouble(scanner.nextLine());

        if (0 <= salary && salary <= 500) {
            if (town.equals("sofia")) {
                System.out.printf("%.2f", salary * 0.05);
            } else if (town.equals("varna")) {
                System.out.printf("%.2f", salary * 0.045);
            } else if (town.equals("plovdiv")) {
                System.out.printf("%.2f", salary * 0.055);
            } else {
                System.out.println("error");
            }
        } else if (500 < salary && salary <= 1000) {
            if (town.equals("sofia")) {
                System.out.printf("%.2f", salary * 0.07);
            } else if (town.equals("varna")) {
                System.out.printf("%.2f", salary * 0.075);
            } else if (town.equals("plovdiv")) {
                System.out.printf("%.2f", salary * 0.08);
            } else {
                System.out.println("error");
            }
        } else if (1000 < salary && salary <= 10000) {
            if (town.equals("sofia")) {
                System.out.printf("%.2f", salary * 0.08);
            } else if (town.equals("varna")) {
                System.out.printf("%.2f", salary * 0.1);
            } else if (town.equals("plovdiv")) {
                System.out.printf("%.2f", salary * 0.12);
            } else {
                System.out.println("error");
            }
        } else if (10000 < salary) {
            if (town.equals("sofia")) {
                System.out.printf("%.2f", salary * 0.12);
            } else if (town.equals("varna")) {
                System.out.printf("%.2f", salary * 0.13);
            } else if (town.equals("plovdiv")) {
                System.out.printf("%.2f", salary * 0.145);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
