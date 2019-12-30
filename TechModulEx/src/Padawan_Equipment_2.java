import java.util.Scanner;

public class Padawan_Equipment_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMonay = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());
        double needLightsabers = Math.ceil(students * 1.1);

        double needLifhtg = lightsabers * needLightsabers;
        double needRobes = students * robes;
        double needBelts = (students - (students / 6)) * belts;



        double realPrice = needLifhtg + needRobes + needBelts;
        if (amountMonay >= realPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", realPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (realPrice - amountMonay));
        }
    }
}
