import java.util.Scanner;

public class Characters_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firnstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        if (firnstChar > secondChar){
            char temp = firnstChar;
            firnstChar = secondChar;
            secondChar = temp;
        }

        System.out.println(chartsBetweenThem(firnstChar, secondChar));
    }

    public static String chartsBetweenThem(char begin, char end) {
        String str = "";
        begin++;
            for (char sym = begin; sym < end; sym++) {
                str += sym + " ";
            }
        return str;
    }

}
