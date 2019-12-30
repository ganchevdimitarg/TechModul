import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePage = Double.parseDouble(scanner.nextLine());
        double priceCover = Double.parseDouble(scanner.nextLine());
        int prcentDiscount = Integer.parseInt(scanner.nextLine());
        double priceDesign = Double.parseDouble(scanner.nextLine());
        int prcentTeam = Integer.parseInt(scanner.nextLine());

        double totalBook = (899 * pricePage) + (2 * priceCover);
        double totalDiscaount = totalBook * (1 - ((float)prcentDiscount/100));
        double total = (totalDiscaount + priceDesign)*(1- ((float) prcentTeam / 100));

        System.out.printf("Avtonom should pay %.2f BGN.", total);
    }
}
