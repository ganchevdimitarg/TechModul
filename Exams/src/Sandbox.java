import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double priceOfSand = Double.parseDouble(scanner.nextLine());
        double priceOfWood = Double.parseDouble(scanner.nextLine());

        double all = wight*height;
        double sand = (wight-0.4)*(height-0.4);
        double bord = all - sand;
        double needSand = sand*20;
        double needWood = bord/(2.2*0.2);
        double priceSand = needSand*priceOfSand;
        double priceWood = needWood*priceOfWood;

        System.out.printf("%.2f", priceSand+priceWood);

    }
}
