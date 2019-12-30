import java.util.Scanner;

public class Extract_Person_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            int startIdex = text.indexOf("@");
            int endIdex = text.indexOf("|");
            int startIdexSec = text.indexOf("#");
            int endIdexSec = text.indexOf("*");
            System.out.printf("%s is %s years old.%n", text.substring(startIdex+1, endIdex), text.substring(startIdexSec+1, endIdexSec));
        }
    }
}
