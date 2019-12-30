import java.util.Scanner;

public class left_right_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int rotate = n * 2;
        int left = 0;
        int right = 0;

        for (int i = 1; i <= rotate; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i <= rotate / 2) {
                left += number;
            } else {
                right += number;
            }
        }

        int minas = Math.abs(left - right);

        if (minas == 0) {
            System.out.println("Yes, sum = " + left);
        } else {
            System.out.println("No, diff = " + minas);
        }
    }
}
