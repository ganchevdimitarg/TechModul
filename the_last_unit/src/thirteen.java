import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int f0 = 1;
        int f1 = 1;
        int nf = 0;
        for (int i = 0; i < n - 1; i++) {
            nf = f0  + f1;
            f0 = f1;
            f1 = nf;
        }
        System.out.println(f1);

    }
}
