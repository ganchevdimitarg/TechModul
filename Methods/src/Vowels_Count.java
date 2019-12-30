import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();

        System.out.println(countNumberOfVowels(str));
    }

    public static int countNumberOfVowels(String str) {
        int couter = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    couter ++;
                    break;
                case 'o':
                    couter ++;
                    break;
                case 'i':
                    couter ++;
                    break;
                case 'e':
                    couter ++;
                    break;
                case 'u':
                    couter ++;
                    break;
            }
        }
        return couter;
    }
}
