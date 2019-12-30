import java.text.DecimalFormat;
import java.util.Scanner;

public class task4_C_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cel = Double.parseDouble(scanner.nextLine());
        double resultFar = (cel*9)/5+32;
        DecimalFormat normalFar = new DecimalFormat("####.##");
        System.out.println(normalFar.format(resultFar));
    }
}
