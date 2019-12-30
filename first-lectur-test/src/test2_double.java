import java.util.Scanner;

public class test2_double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inch= ");
        double inch = scanner.nextDouble();
        double to_cm = inch * 2.54;

        System.out.println("CM: " + to_cm);
    }
}
