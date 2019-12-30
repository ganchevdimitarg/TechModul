import java.util.Scanner;

public class Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String first = repeatStr(" ", n - 1 - i) + repeatStr("* ", i + 1);
            System.out.println(first);
        }
        for (int i = n - 1; i >= 0; i--) {
            String s = repeatStr(" ", n - i) + repeatStr("* ", i);
            System.out.println(s);
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
