import java.util.Scanner;

public class L_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int cash = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, cash);
    }

    public static void printTotalPrice (String str,int num){
        switch (str) {
            case "coffee": {
                double sum = num * 1.5;
                System.out.printf("%.2f", sum);
                break;
            }
            case "water": {
                double sum = num * 1.0;
                System.out.printf("%.2f", sum);
                break;
            }
            case "coke": {
                double sum = num * 1.4;
                System.out.printf("%.2f", sum);
                break;
            }
            default: {
                double sum = num * 2.0;
                System.out.printf("%.2f", sum);
                break;
            }
        }
    }
}
