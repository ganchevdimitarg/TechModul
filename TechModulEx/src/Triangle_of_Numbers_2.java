import java.util.Scanner;

public class Triangle_of_Numbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.printf("%d ", row);
            }
            System.out.println();
        }
    }
}
