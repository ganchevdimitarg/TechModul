import java.util.Scanner;

public class Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int num = 0;

        if (secondNum < 10) {
            for (int i = 0; secondNum < 11; i++) {
                num = n * secondNum;
                System.out.println(n + " X " + secondNum + " = " + num);
                secondNum++;
            }
        } else {
            System.out.println(n + " X " + secondNum + " = " + (n * secondNum));
        }
    }
}
