import java.util.Scanner;

public class Small_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double number = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("sofia")){
            if (product.equals("coffee")){
                price = number * 0.5;
                System.out.println(price);
            } else if (product.equals("water")){
                price = number*0.8;
            System.out.println(price);
            }else if (product.equals("beer")){
                price = number*1.2;
                System.out.println(price);
            }else if (product.equals("sweets")){
                price = number*1.45;
                System.out.println(price);
            }else if (product.equals("peanuts")){
                price = number*1.6;
                System.out.println(price);
            }
        } else if (town.equals("plovdiv")) {
            if (product.equals("coffee")) {
                price = number * 0.4;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = number * 0.7;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = number * 1.15;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = number * 1.3;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = number * 1.5;
                System.out.println(price);
            }
        } else if (town.equals("varna")) {
            if (product.equals("coffee")) {
                price = number * 0.45;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = number * 0.7;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = number * 1.1;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = number * 1.35;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = number * 1.55;
                System.out.println(price);
            }
        }
    }
}
