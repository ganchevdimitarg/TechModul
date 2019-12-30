import java.text.DecimalFormat;
import java.util.Scanner;

public class Transport_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine().toLowerCase();
        double r = Double.MAX_VALUE;
        DecimalFormat decima = new DecimalFormat("#.##");

        if (n < 20) {
            if (dayOrNight.equals("day")) {
                double z = 0.7 + n * 0.79;
                r = z;
            } else {
                double w = 0.7 + n * 0.9;
                r = w;
            }
        }
        if (n >= 20 && n < 100) {
            double o = n * 0.09;
            r = o;
        }
        if (n >= 100) {
            double l = n * 0.06;
            r = l;
        }
        System.out.printf(decima.format(r));
    }
}
