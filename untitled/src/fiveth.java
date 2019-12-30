import java.util.Scanner;

public class fiveth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int width = (4 * num) - 4;
        int spaces = width - 4;
        int starsAndPipesCount = 1;

        for (int i = 0; i < num - 2; i++) {
            System.out.println(repeatString("*\\", starsAndPipesCount)
                    + repeatString(" ", spaces)
                    + repeatString("/*", starsAndPipesCount));
            spaces -= 4;
            starsAndPipesCount++;
        }

        System.out.println(repeatString("\\/", width / 2));

        int countCh = (width - 6) / 2;
        for (int i = 0; i < num / 2; i++) {

            System.out.println(repeatString("<", countCh)
                    + "*|**|*"
                    + repeatString(">", countCh));
        }

        System.out.println(repeatString("/\\", width / 2));

        spaces += 4;
        starsAndPipesCount --;
        for (int i = 0; i < num - 2; i++) {
            System.out.println(repeatString("*/", starsAndPipesCount)
                    + repeatString(" ", spaces)
                    + repeatString("\\*", starsAndPipesCount));
            spaces += 4;
            starsAndPipesCount--;
        }
    }

    public static String repeatString(String text, int times) {
        StringBuilder result = new StringBuilder();

        while (times > 0) {
            result.append(text);

            times--;
        }

        return result.toString();
    }
}
