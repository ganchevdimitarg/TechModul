import java.text.DecimalFormat;
import java.util.Scanner;

public class UnitSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#############");
        int buyFood = Integer.parseInt(scanner.nextLine());
        int eatenFood;
        int counter = 0;
        String adopte = "";
        int bFg = buyFood *1000;

        while (!adopte.equals("Adopted")) {
            adopte = scanner.nextLine();
            if (adopte.equals("Adopted")){
                continue;
            }else {
                counter += Double.parseDouble(adopte);
                if (buyFood % 2 == 0) {
                    eatenFood = Integer.parseInt(scanner.nextLine());
                    counter += eatenFood;
                }
            }
        }
        if (adopte.equals("Adopted")) {
            adopte = "Adopted";
            if (counter < bFg) {
                System.out.println("Food is enough! Leftovers: " + decimalFormat.format(bFg - counter) + " grams.");
            } else if (counter > bFg) {
                System.out.println("Food is not enough. You need " + decimalFormat.format(counter - bFg) + " grams more.");
            } else if (counter == bFg) {
                System.out.println("Food is enough! Leftovers: 0 grams.");
            }
        }
    }
}
