import java.util.Scanner;

public class Bonus_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double points = 0;

        if (num <= 100) {
            points += 5;
        } else if (num > 100 && num <= 1000) {
            points += (num * 0.2);
        } else if (num > 1000) {
            points += (num * 0.1);
        }

        if (num % 2 == 0) {
            points += 1;
        } else if (num % 5 == 0) {
            points += 2;
        }

        System.out.println(points);
        System.out.println(num + points);

    }
}
