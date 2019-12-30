import java.text.DecimalFormat;
import java.util.Scanner;

public class task3_Triangle_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = (a * h) / 2;

        DecimalFormat resultForm = new DecimalFormat("#####.##");
        System.out.println(resultForm.format(area));
    }
}
