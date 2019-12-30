import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int consume = 26;
        int leaving = 0;
        int sumOfLeaving = 0;
        int days = 0;

        while (startingYield >= 100) {
            days++;
            sumOfLeaving += (startingYield - consume);
            startingYield -= 10;

        }
        if (sumOfLeaving >= 26) {
            sumOfLeaving -= 26;
        }
        System.out.println(days);
        System.out.println(sumOfLeaving);

    }
}
