import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeWord = scanner.nextLine();
        String string = scanner.nextLine();

        while (string.contains(removeWord)) {
            string = string.replace(removeWord, "");
        }
        System.out.println(string);
    }
}
