import java.util.Scanner;

public class Tailoring_Workshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nmb = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double usd = ((nmb * (lenght + 2 * 0.3) * (width + 2 * 0.3)) * 7 +
                (nmb * (lenght / 2) * (lenght / 2)) * 9);
        double bgn =  usd * 1.85;

        System.out.printf("%.2f" + " USD%n", usd);
        System.out.printf("%.2f" + " BGN", bgn);
    }
}
