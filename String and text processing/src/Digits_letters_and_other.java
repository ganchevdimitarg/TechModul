import java.util.Scanner;

public class Digits_letters_and_other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        System.out.println(line.replaceAll("[^0-9]+", ""));
        System.out.println(line.replaceAll("[^a-zA-Z]+", ""));
        System.out.println(line.replaceAll("[a-zA-Z 0-9]+", ""));
    }
}
