import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String project = scanner.nextLine().toLowerCase();
        int numRow = Integer.parseInt(scanner.nextLine());
        int numColum = Integer.parseInt(scanner.nextLine());
        double income;

        if (project.equals("premiere")) {
            income = numColum * numRow * 12.00;
            System.out.printf("%.2f leva", income );
        } else if (project.equals("normal")){
            income = numColum * numRow * 7.5;
            System.out.printf("%.2f leva", income);
        } else if (project.equals("discount")){
            income = numColum * numRow * 5.00;
            System.out.printf("%.2f", income);
        }
    }
}
