import java.util.Scanner;

public class sum_of_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int bigger = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > bigger) {
                bigger = number;
            }
            sum += number;
        }

        int result = bigger - (sum - bigger);
        if (result < 0) {
            result *= (-1);
        }

        if ((sum - bigger) == bigger) {
            System.out.println("Yes");
            System.out.println("Sum = " + bigger);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + result);
        }
    }
}
