import java.util.Scanner;

public class Even_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }

        if (n < 0) {
            System.out.println("The number is: " + (n * -1));
        } else {
            System.out.println("The number is: " + n);
        }
    }
}
