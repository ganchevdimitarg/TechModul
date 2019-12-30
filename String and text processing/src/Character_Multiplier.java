import java.util.Scanner;

public class Character_Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");


         System.out.println(Multipluer(words[0], words[1]));

    }

    private static int Multipluer(String firstWord, String secondWord) {
        int sum = 0;
        int lenght = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < lenght; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (firstWord.length() > secondWord.length()) {
            for (int i = lenght; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }
        } else if (firstWord.length() < secondWord.length()){
            for (int i = lenght; i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
        }

        return sum;
    }
}
