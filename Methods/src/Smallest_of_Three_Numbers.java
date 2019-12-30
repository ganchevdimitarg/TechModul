import java.util.Scanner;

public class Smallest_of_Three_Numbers {

    public static void printSmallestNumber(int f, int s, int t) {
        if (f < s && f < t) {
            System.out.println(f);
        } else if (s < f && s < t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFirst = Integer.parseInt(scanner.nextLine());
        int numSecond = Integer.parseInt(scanner.nextLine());
        int numTrird = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(numFirst, numSecond, numTrird);
    }
}
