import java.util.Scanner;

public class Invalid_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        boolean isNumber = ((number >= 100 && number <= 200) || number == 0);

        if (!isNumber) {
            System.out.println("invalid");
        }
    }
}
