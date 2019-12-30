import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startGram = Integer.parseInt(scanner.nextLine());
        int oneProductGram = Integer.parseInt(scanner.nextLine());
        double priceProduct = Double.parseDouble(scanner.nextLine());
        int sellBreat = Integer.parseInt(scanner.nextLine());
        double sellCookies = Double.parseDouble(scanner.nextLine());

        double totalSellBreat = sellBreat * priceProduct;
        double totalNeed = sellBreat * oneProductGram; //OK
        double priceCookies = priceProduct + (priceProduct * 0.25);
        double cookiesGram = oneProductGram - (oneProductGram * 0.2);
        double totalDough = sellCookies * cookiesGram; //OK
        double totalIncome = sellCookies * priceCookies;
        double totalCosts = ((totalNeed + startGram)/1000) * 4;
        double clearIncome = (totalSellBreat + totalIncome) - totalCosts;
        double total = totalNeed + totalDough; //OK

        System.out.printf("Pure income: %.2f lv.%n", clearIncome);
        System.out.println("Dough used: " + Math.round(total) + " g.");
    }
}
