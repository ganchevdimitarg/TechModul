import java.util.Scanner;

public class Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int nextNumber = 1; nextNumber <= number; nextNumber++) {
            int shownNumber = nextNumber;
            while (nextNumber > 0) {
                sum += nextNumber % 10;
                nextNumber = nextNumber / 10;
            }
            if ((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", shownNumber);
            } else {
                System.out.printf("%d -> False%n", shownNumber);
            }
            sum = 0;
            nextNumber = shownNumber;
        }

    }
}
