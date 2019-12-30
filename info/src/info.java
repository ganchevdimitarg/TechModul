import java.util.Scanner;

public class info {
    public static void main(String[] args) {

        // sum all digit with string
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        int sumOfDigit = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            sumOfDigit += inputNumber.charAt(i) - '0';
        }
        System.out.println(sumOfDigit);

        // char to string if Only n inputs
        String charter = scanner.nextLine();
        charter += scanner.nextLine();
        charter += scanner.nextLine();
        System.out.println(charter);
    }
}
