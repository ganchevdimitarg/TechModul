import java.util.Scanner;

public class L_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f",raisePower(number,power));
    }

    public static double raisePower (double n, double p){
        double newNum = 0d;

        for (int i = 0; i < n; i++) {
            newNum = Math.pow(n, p);
        }
        return newNum;
    }
}
