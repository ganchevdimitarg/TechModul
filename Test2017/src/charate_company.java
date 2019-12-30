import java.util.Scanner;

public class charate_company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDays = Integer.parseInt(scanner.nextLine());
        int numCokers = Integer.parseInt(scanner.nextLine());
        int numCmake = Integer.parseInt(scanner.nextLine());
        int numCrimp = Integer.parseInt(scanner.nextLine());
        int numPancake = Integer.parseInt(scanner.nextLine());

        int cmake = numCmake * 45;
        double crimp = numCrimp * 5.80;
        double pancake = numPancake * 3.20;
        double totalOfDay = (cmake + crimp + pancake) * numCokers;
        double total = totalOfDay * numDays;
        double totalWithout = total - (total / 8);

        System.out.printf("%.2f", totalWithout);

    }
}
