import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gendar = scanner.nextLine().charAt(0);
        double kilogram = Double.parseDouble(scanner.nextLine());
        double metri = Double.parseDouble(scanner.nextLine());
        double year = Double.parseDouble(scanner.nextLine());
        String level = scanner.nextLine();


        if (gendar == 'm') {
            double BHM = 66 + (13.7 * kilogram) + (500 * metri) - (6.8 * year);
            if (level.equals("sedentary")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.2) + " calories per day.");
            } else if (level.equals("lightly active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.375) + " calories per day.");
            } else if (level.equals("moderately active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.55) + " calories per day.");
            } else if (level.equals("very active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.725) + " calories per day.");
            }
        } else if (gendar == 'f') {
            double BHM = 655 + (9.6 * kilogram) + (180 * metri) - (4.7 * year);
            if (level.equals("sedentary")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.2) + " calories per day.");
            } else if (level.equals("lightly active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.375) + " calories per day.");
            } else if (level.equals("moderately active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.55) + " calories per day.");
            } else if (level.equals("very active")) {
                System.out.println("To maintain your current weight you will need " + (int) Math.ceil(BHM * 1.725) + " calories per day.");
            }
        }
    }
}
