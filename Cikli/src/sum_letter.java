import java.util.Scanner;

public class sum_letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int overall = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                overall += 1;
            } else if (word.charAt(i) == 'e') {
                overall += 2;
            } else if (word.charAt(i) == 'i') {
                overall += 3;
            } else if (word.charAt(i) == 'o') {
                overall += 4;
            } else if (word.charAt(i) == 'u') {
                overall += 5;
            }
        }
        System.out.println(overall);

    }
}
