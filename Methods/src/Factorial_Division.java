import java.util.Scanner;

public class Factorial_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());


        System.out.printf("%.2f", facturielOfNumber(first)/facturielOfNumber(second));
    }

    public static double facturielOfNumber(int f){
        double fac = 1;
        for (int i = 1; i <= f; i++) {
            fac *= i;
        }
        return fac;
    }
}
