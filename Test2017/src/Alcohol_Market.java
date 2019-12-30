import java.util.Scanner;

public class Alcohol_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWhisky = Double.parseDouble(scanner.nextLine());
        double bira = Double.parseDouble(scanner.nextLine());
        double vine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double whisky = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWhisky / 2;
        double priceVine = priceRakia - (0.4 * priceRakia);
        double priceBira = priceRakia - (0.8 * priceRakia);

        double volumeRakia = priceRakia * rakia;
        double volumeVine = priceVine * vine;
        double volumeBira = priceBira * bira;
        double volumeWhisky = priceWhisky * 1;

        double total = volumeBira + volumeRakia + volumeVine + volumeWhisky;

        System.out.printf("%.2f", total);
    }
}
