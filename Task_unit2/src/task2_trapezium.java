import java.util.Scanner;

public class task2_trapezium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        System.out.println("Trapezoid area = " + (((b1 + b2) * h) / 2));
    }
}
