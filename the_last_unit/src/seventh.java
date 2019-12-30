import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        while (b != 0) {
            int old = b;
            b = a % b;
            a = old;
        }
        System.out.println(a);
    }
}
