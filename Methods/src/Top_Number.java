import java.util.Scanner;

public class Top_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        sumOfDigits(number);
    }

    public static void sumOfDigits(int n) {
        for (int i = 0; i <= n; i++) {
            int num = i;
            int sum = 0;
            boolean haveOddDigit = false;
            while (num > 0) {
                int numOdd = num % 10;
                num /= 10;
                sum += numOdd;
                if (numOdd % 2 != 0) {
                    haveOddDigit = true;
                }
            }
            if (haveOddDigit && sum % 8 == 0) {
                System.out.println(i);
            }
        }
    }
}
