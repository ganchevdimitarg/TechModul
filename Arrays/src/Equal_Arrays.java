import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        int diff = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
            } else {
                diff = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", diff);
                diff=1;
                break;
            }
        }
        if (diff == 0) {
            System.out.printf(("Arrays are identical. Sum: %d%n"), sum);
        }
    }
}
