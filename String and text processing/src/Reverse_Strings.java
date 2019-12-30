import java.util.Scanner;

public class Reverse_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineForReverse = scanner.nextLine();

        while (!lineForReverse.equals("end")) {
            String reverseLine = "";
            for (int i = lineForReverse.length() - 1; i >= 0; i--) {
                reverseLine += lineForReverse.charAt(i);
            }
            System.out.println(lineForReverse + " = " + reverseLine);
            reverseLine = "";
            lineForReverse = scanner.nextLine();
        }

    }
}
