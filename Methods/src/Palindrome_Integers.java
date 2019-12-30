import java.util.Scanner;

public class Palindrome_Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {

            if (number.equals(backwardStirng(number))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            number = scanner.nextLine();
        }
    }

    public static String backwardStirng(String n) {
        String str = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            str += "" + n.charAt(i);
        }
        return str;
    }

}
