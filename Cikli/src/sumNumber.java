import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int oneNum = Integer.parseInt(scanner.nextLine());
            sum += oneNum;
        }
        System.out.println(sum);
    }
}
