import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char n = scanner.nextLine().charAt(0);
        String b = "" + n;
        String a = b.toUpperCase();
        if (b.equals(a)){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
