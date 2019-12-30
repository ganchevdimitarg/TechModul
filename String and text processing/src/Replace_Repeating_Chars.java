import java.util.Scanner;

public class Replace_Repeating_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length()-1) {
                newWord += word.charAt(i);
                break;
            }
            while (word.charAt(i) != word.charAt(i + 1)) {
                newWord += word.charAt(i);
                i++;
                if (i == word.length() - 1){
                    newWord += word.charAt(i);
                    break;
                }
            }
        }
        System.out.println(newWord);
    }
}
