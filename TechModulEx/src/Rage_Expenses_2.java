import java.util.Scanner;

public class Rage_Expenses_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double headsetCount = 0;
        double mouseCount = 0;
        double keyboardCount = 0;
        double displayCount = 0;

        for (int i = 1; i <= lostGame; i++) {
            if (i % 2 == 0) {
                headsetCount += 1;
            }
            if (i % 3 == 0) {
                mouseCount += 1;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardCount += 1;
                if (keyboardCount % 2 == 0) {
                    displayCount += 1;
                }
            }
        }
        double result = headsetCount * headsetPrice + mouseCount * mousePrice +
                keyboardCount * keyboardPrice + displayCount * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", result);
    }
}
