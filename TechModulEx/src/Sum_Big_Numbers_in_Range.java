import java.util.Scanner;

public class Sum_Big_Numbers_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = one; i <= two; i++) {
            sum += one;
            one+=1;
        }
        System.out.println(sum);
    }
}
