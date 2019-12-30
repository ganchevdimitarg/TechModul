import java.util.Scanner;

public class Print_and_Sum_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.print(i + " ");
            sum += i;

        }
        System.out.printf("%nSum: %d", sum);
    }
}
