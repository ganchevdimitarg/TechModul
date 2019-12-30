import java.text.DecimalFormat;
        import java.util.Scanner;

public class test6_perimeter_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double a = Math.max(x1, x2) - Math.min(x1, x2);
        double b = Math.max(y1, y2) - Math.min(y1, y2);
        System.out.println(a * b);
        System.out.println(2 * (a + b));
    }
}
