import java.util.Scanner;

public class Text_Filter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : words){
            String stars = word.replaceAll(".", "*");
            text = text.replace(word, stars);
        }
        System.out.println(text);
    }
}
