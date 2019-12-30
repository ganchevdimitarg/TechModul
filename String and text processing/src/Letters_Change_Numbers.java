import java.util.Scanner;

public class Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");

        double total = 0;

        for (String number : numbers) {
            char first = number.charAt(0);
            char second = number.charAt(number.length() - 1);
            double num = Double.parseDouble(number.substring(1, number.length() - 1));

            if (Character.isUpperCase(first)) {
                num = num / (first - 'A' + 1);
            } else {
                num = num * (first - 'a' + 1);
            }

            if (Character.isUpperCase(second)) {
                num = num - (second - 'A' + 1);
            } else {
                num = num + (second - 'a' + 1);
            }

            total += num;
        }
        System.out.println(String.format("%.2f", total));
    }
}
