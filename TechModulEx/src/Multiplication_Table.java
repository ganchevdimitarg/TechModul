import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        for (int i = 1; i < 11; i++) {
            num = n * i;
            System.out.println(n + " X " + i + " = " + num);
        }
    }
}
