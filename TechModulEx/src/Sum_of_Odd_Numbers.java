import java.util.Scanner;

public class Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 1;
        System.out.println(num);
        for (int i = 1; i < n; i++) {
            System.out.println(num+=2);
            sum+=num;
        }
        System.out.println("Sum: " + (sum+1));
    }
}
