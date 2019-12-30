import java.util.Scanner;

public class Draw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 4) {
            System.out.println("/" + repeatStr("^", n -2) + "\\/" + repeatStr("^", n -2) + "\\");
        }


    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
