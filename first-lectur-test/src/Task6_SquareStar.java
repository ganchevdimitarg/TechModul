import java.util.Scanner;

public class Task6_SquareStar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr("*", number));

        //средни редове
        for (int i = 0; i < number - 2; i++) {
            System.out.println("*" + repeatStr(" ", number - 2) + "*");

        }
        System.out.println(repeatStr("*", number));


    }

    static String repeatStr(String str, int count) {
        String text = "";
        {
            for (int j = 0; j < count; j++) {
                text = text + str;
            }

        }
        return text;
    }
}
