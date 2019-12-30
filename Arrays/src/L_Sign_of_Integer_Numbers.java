import java.util.Scanner;

public class L_Sign_of_Integer_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printNumberPositiveOrNegative(number);
    }

    public static void printNumberPositiveOrNegative(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num >0){
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number 0 is zero.");
        }
    }

}
