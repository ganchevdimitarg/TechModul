import java.util.Scanner;

public class Repeat_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] n = scanner.nextLine().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : n) {
            int wordLeght = word.length();
            for (int j = 0; j < wordLeght; j++) {
                stringBuilder.append(word);
            }
        }
        System.out.println(stringBuilder);
    }
}
