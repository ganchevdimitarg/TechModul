import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyEat = Double.parseDouble(scanner.nextLine());
        double moneySuveniar = Double.parseDouble(scanner.nextLine());
        double moneyHotel = Double.parseDouble(scanner.nextLine());
        double moneyfuel = ((float) (420 * 7)/100)*1.85;
        double total = moneyEat * 3 + moneySuveniar * 3 + moneyfuel +(moneyHotel-(moneyHotel*0.1))+(moneyHotel-(moneyHotel*0.15))+(moneyHotel-(moneyHotel*0.2));

        System.out.printf("Money needed: %.2f", total);
    }
}
