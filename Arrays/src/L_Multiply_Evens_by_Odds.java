import java.util.Scanner;

public class L_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());

        System.out.println(multiplySum(number));
    }

    public static long multiplySum(long n) {

        long sumOdd = 0;
        long sumEven = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                sumEven+= n % 10;
            } else {
                sumOdd += n % 10;
            }
            n = n / 10;
        }

        return sumEven*sumOdd;
    }

}
