import java.util.Scanner;

public class Training_Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());


        double a = (h * 100) - 100;
        double b = a / 70;
        double c = (w * 100) / 120;

        double d = (int)b * (int)c - 3;


        System.out.printf("%.0f", d);

    }
}
