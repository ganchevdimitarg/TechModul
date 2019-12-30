import java.util.Scanner;

public class Square_Frame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String text = "+ " + repeatStr("- ", n - 2) + "+";
        System.out.println(text);
        for (int i = 0; i < n - 2; i++) {
            String text2 = "| " + repeatStr("- ", n - 2) + "|";
            System.out.println(text2);
        }
        String text3 = "+ " + repeatStr("- ", n - 2) + "+";
        System.out.println(text3);
    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
