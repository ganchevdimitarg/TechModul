import java.util.Scanner;

public class odd_even_possition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double oddMax = 1000000000.0;
        double oddMin = -1000000000.0;
        double evenMax = 1000000000.0;
        double evenMin = -1000000000.0;
        double oddSum = 0;
        double evenSum = 0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                } else if (number < evenMin) {
                    evenMin = number;
                } else {
                    evenMin = number;
                    evenMax = number;
                }
            } else if (i % 2 != 0) {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                } else if (number < oddMin) {
                    oddMin = number;
                } else {
                    oddMin = number;
                    oddMax = number;
                }
            }
        }
        System.out.printf("OddSum= %.0f,%n", oddSum);
        if (oddMin == -1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin= %.0f,%n", oddMin);
        }
        if (oddMax == 1000000000.0) {
            if (n == 1) {
                System.out.printf("OddMax=%.0f%n", oddMin);
            } else {
                System.out.println("OddMax=No,");
            }
        } else {
            System.out.printf("OddMax= %.0f,%n", oddMax);
        }
        System.out.printf("EvenSum= %.0f,%n", evenSum);
        if (evenMin == -1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin= %.0f,%n", evenMin);
        }
        if (evenMax == 1000000000.0) {
            System.out.println("EvenMax=No,");
        } else {
            System.out.printf("EvenMax= %.0f,%n", evenMax);
        }
    }
}
