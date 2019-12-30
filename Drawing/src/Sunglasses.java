import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String f = repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2);
        System.out.println(f);

        for (int i = 0; i < n - 2; i++) {
            if (i == (n-1) / 2 - 1){

                String g = "*" + repeatStr("/", 2 * n - 2) + "*" + repeatStr("|", n)
                        + "*" + repeatStr("/", 2 * n - 2) + "*";
                System.out.println(g);
            } else {
                String s = "*" + repeatStr("/", 2 * n - 2) + "*" + repeatStr(" ", n)
                        + "*" + repeatStr("/", 2 * n - 2) + "*";
                System.out.println(s);
            }
        }
        String t = repeatStr("*", n * 2) + repeatStr(" ", n) + repeatStr("*", n * 2);
        System.out.println(t);

    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
