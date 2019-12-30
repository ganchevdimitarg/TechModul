import java.util.Scanner;

public class Vending_Machine_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String begin = scanner.nextLine();

        double totalSum = 0;
        double buySum = 0;
        while (!begin.equals("Start")) {
            double total = Double.parseDouble(begin);

            if (total != 0.1 && total != 0.2 && total != 0.5 && total != 1 && total != 2) {
                System.out.printf("Cannot accept %.2f%n", total);
            } else {
                totalSum += total;
            }
            begin = scanner.nextLine();

        }
        begin = scanner.nextLine();
        while (!begin.equals("End")) {
            if (begin.equals("Nuts") || begin.equals("Water") || begin.equals("Crisps") ||
                    begin.equals("Soda") || begin.equals("Coke")) {
                if (begin.equals("Nuts")) {
                    buySum += 2;
                } else if (begin.equals("Water")) {
                    buySum += 0.7;
                } else if (begin.equals("Crisps")) {
                    buySum += 1.5;
                } else if (begin.equals("Soda")) {
                    buySum += 0.8;
                } else if (begin.equals("Coke")) {
                    buySum += 1;
                }
                if (buySum > totalSum) {
                    System.out.println("Sorry, not enough money");
                    if (begin.equals("Nuts")) {
                        buySum -= 2;
                    } else if (begin.equals("Water")) {
                        buySum -= 0.7;
                    } else if (begin.equals("Crisps")) {
                        buySum -= 1.5;
                    } else if (begin.equals("Soda")) {
                        buySum -= 0.8;
                    } else if (begin.equals("Coke")) {
                        buySum -= 1;
                    }
                    break;
                }
                System.out.printf("Purchased %s%n", begin);
            } else {
                System.out.println("Invalid product");
            }
            begin = scanner.nextLine();
        }
        if (buySum > totalSum) {
            System.out.printf("Change: %.2f", buySum - totalSum);
        } else {
            System.out.printf("Change: %.2f", totalSum - buySum);
        }
    }
}


