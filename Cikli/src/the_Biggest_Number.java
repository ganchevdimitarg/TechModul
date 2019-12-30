import java.util.Scanner;

public class the_Biggest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= number; i++) {
            int oneNumber = Integer.parseInt(scanner.nextLine());

            if (oneNumber > max){
                max = oneNumber;
            }
        }
        System.out.println(max);
    }
}
