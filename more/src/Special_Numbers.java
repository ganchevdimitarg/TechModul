import java.util.Scanner;

public class Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        boolean toe = false;
        boolean diffrent;
        for (int i = 1; i <= n; i++) {
            num = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            toe = (sum == 5) || (sum == 7) || (sum == 11);
            if (toe == true){
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }

            sum = 0;
            i = num;
        }

    }
}
