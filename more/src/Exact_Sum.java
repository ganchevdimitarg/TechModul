import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exact_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Long.parseLong(scanner.nextLine());
        BigDecimal sum = new BigDecimal (0);
        for (int i = 0; i < n; i++) {
            BigDecimal a = new BigDecimal(scanner.nextLine());
            sum = sum.add(a);
        }
        System.out.println(sum);
    }
}
