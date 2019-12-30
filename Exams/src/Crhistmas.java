import java.util.Scanner;

public class Crhistmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pcRoller = Integer.parseInt(scanner.nextLine());
        int pcCloth = Integer.parseInt(scanner.nextLine());
        double litter = Double.parseDouble(scanner.nextLine());
        int percentLow = Integer.parseInt(scanner.nextLine());

        double totalRoller = pcRoller * 5.8;
        double totalCloth = pcCloth * 7.2;
        double totalLitter = litter * 1.2;
        double total = (totalCloth+totalLitter+totalRoller)-((totalCloth+totalLitter+totalRoller)*(float)percentLow/100);

        System.out.printf("%.3f", total);
    }
}
