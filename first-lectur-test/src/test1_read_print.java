import java.util.Scanner;

public class test1_read_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int nubmerA = scanner.nextInt();
        int result = nubmerA * nubmerA;

        System.out.println("test result: " + result);
    }
}
