import java.sql.SQLOutput;
import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                even += number;
            } else {
                odd +=number;
            }
        }

        int result = Math.abs(even - odd);

        if (result == 0){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + result);
        }
    }
}
