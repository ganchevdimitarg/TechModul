import java.util.Scanner;

public class Fruit_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double number = Double.parseDouble(scanner.nextLine());
        boolean weekand = day.equals("saturday") || day.equals("sunday");
        boolean week = day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                day.equals("thursday") || day.equals("friday");

        if (week) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", number * 2.5);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", number * 1.2);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", number * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", number * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", number * 2.7);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", number * 5.5);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", number * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (weekand) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", number * 2.7);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", number * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", number * 0.9);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", number * 1.6);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", number * 3);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", number * 5.6);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", number * 4.2);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
