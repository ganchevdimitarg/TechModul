import java.util.Scanner;

public class L_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedStirng(str, num));
    }

    public static String repeatedStirng (String str, int num){
        String newStr = "";
        for (int i = 0; i < num; i++) {
            newStr += str;
        }

        return newStr;
    }
}
