import java.util.Scanner;

public class Dance_Hall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double side = Double.parseDouble(scanner.nextLine());

        double hall = (width * lenght) * 100;
        double wardrobe = 100 * (side * side);
        double bench = hall / 100;
        double freeSpace = hall - wardrobe - bench;
        double dancer = freeSpace / (40 + 7000);

        System.out.println(Math.floor(dancer));
    }
}
