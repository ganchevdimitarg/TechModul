import java.util.Scanner;

public class Draw_Fort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String top = repeatStr("-", n + 2) +
                    "**" + repeatStr("-", n + 2);
            System.out.println(top);
        }

        for (int i = 1; i <= n - 3; i++) {
            String middle = repeatStr("-", n + 1) + "****" + repeatStr("-", n + 1);
            System.out.println(middle);
        }

        System.out.println(repeatStr("-", n) + "******" + repeatStr("-", n));

        for (int i = 1; i <= n - 4; i++) {
            String middle2 = repeatStr("-", n) + "**--**" + repeatStr("-", n);
            System.out.println(middle2);
        }

        for (int i = 1; i <= n - 3; i++) {
            String middle2 = repeatStr("-", n -1) + "**----**" + repeatStr("-", n -1);
            System.out.println(middle2);
        }

        System.out.println(repeatStr("-", n - 2) + "**********" + repeatStr("-", n - 2));

        for (int i = 0; i < n - 3; i++) {
            String middle2 = repeatStr("-", n - 3 - i) + "**" + repeatStr("-", 8 + i * 2) + "**" + repeatStr("-", n - 3 - i);
            System.out.println(middle2);
        }

        System.out.println("***" + repeatStr("-", n*2) + "***");
    }

    static String repeatStr(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
