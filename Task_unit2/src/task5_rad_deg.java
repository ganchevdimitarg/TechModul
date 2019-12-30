import java.text.DecimalFormat;
import java.util.Scanner;

public class task5_rad_deg {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
            double red = Double.parseDouble(scanner.nextLine());
            double deg = 57.29578*red;

        DecimalFormat resultDeg = new DecimalFormat("###");
        System.out.println(resultDeg.format(deg));
    }
}
