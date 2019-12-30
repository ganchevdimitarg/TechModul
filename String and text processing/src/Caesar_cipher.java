import java.util.Scanner;

public class Caesar_cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText += (char) (text.charAt(i) + 3);
        }
        System.out.println(newText);
    }
}
