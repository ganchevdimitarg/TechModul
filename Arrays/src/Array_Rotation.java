import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strNum = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        rotation = rotation % strNum.length;

        for (int i = 0; i < rotation; i++) {
            String n = strNum[0];
            for (int j = 0; j < strNum.length -1; j++) {
                strNum[j] = strNum[j + 1];
            }

            strNum[strNum.length - 1] = n;
        }
        for (String aStrNum : strNum) {
            System.out.print(aStrNum + " ");
        }
    }
}
