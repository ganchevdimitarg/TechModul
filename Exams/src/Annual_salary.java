import java.util.Scanner;

public class Annual_salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int experience = Integer.parseInt(scanner.nextLine());
        String profetion = scanner.nextLine();
        double salary = 0;

        if (experience <= 5) {
            if (profetion.equals("C# Developer")) {
                salary = (5400 - (5400 * 0.658)) * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Java Developer")) {
                salary = (5700 - (5700 * 0.658)) * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Front-End Web Developer")) {
                salary = (4100 - (4100 * 0.658)) * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("UX / UI Designer")) {
                salary = (3100 - (3100 * 0.658)) * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Game Designer")) {
                salary = (3600 - (3600 * 0.658)) * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            }
        } else {
            if (profetion.equals("C# Developer")) {
                salary = 5400 * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Java Developer")) {
                salary = 5700 * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Front-End Web Developer")) {
                salary = 4100 * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("UX / UI Designer")) {
                salary = 3100 * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            } else if (profetion.equals("Game Designer")) {
                salary = 3600 * 12;
                System.out.printf("Total earned money: %.2f BGN", salary);
            }
        }
    }
}
