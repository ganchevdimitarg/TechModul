import java.util.Scanner;

public class Christmas_Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String f = repeatStr(" ", n + 1) + "|";
        System.out.println(f);

        for (int i = 0; i < n; i++) {
            String s = repeatStr(" ", n - 1 - i) + repeatStr("*", i + 1) + " | " + repeatStr("*", i + 1);
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
