import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            } else {
                oddSum += numArr[i];
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
