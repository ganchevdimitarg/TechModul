import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] sum = new int[numbers.length];
        int result = 0;
        int n = numbers.length;
        if (numbers.length == 1) {
            System.out.printf("%d is already condensed to number", numbers[0]);
        } else {
            while (numbers.length >= 1) {
                for (int i = 0; i < numbers.length - 1; i++) {
                    sum[i] = numbers[i] + numbers[i + 1];

                }
                for (int i = 0; i < sum.length; i++) {
                    numbers[i] = sum[i];
                }
                n--;
            }
            for (int i = 0; i < sum.length - 1; i++) {
                result += sum[i];
            }

        }
        System.out.println(result);

    }
}
