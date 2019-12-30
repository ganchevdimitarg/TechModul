import java.util.Scanner;

public class UnitFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int bYear = Integer.parseInt(scanner.nextLine());

            char firstLetterName = firstName.charAt(0);
            char firstLetterLast = lastName.charAt(0);
            System.out.print(bYear);
            System.out.print((int)firstLetterName);
            System.out.print((int)firstLetterLast);
            System.out.print(i);
            System.out.println();
        }
    }
}
