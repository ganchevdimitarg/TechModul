import java.util.Scanner;

public class Middle_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        printMiddleChart(str);
    }

    public static void printMiddleChart (String s){
        if (s.length() % 2 == 0){
            System.out.println("" + s.charAt(s.length()/2 - 1) + s.charAt(s.length()/2));
        } else {
            System.out.println(s.charAt(s.length()/2));
        }
    }

}
