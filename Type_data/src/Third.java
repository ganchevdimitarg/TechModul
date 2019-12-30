import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        long polpulation = Long.parseLong(scanner.nextLine());
        long distance = Long.parseLong(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, polpulation, distance);
    }
}
