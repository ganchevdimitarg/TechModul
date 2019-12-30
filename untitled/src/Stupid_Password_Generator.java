import java.util.Scanner;

public class Stupid_Password_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        char b = 'a';
        char c = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    String firstLetter = "" + b;
                    b++;
                    if (k == l) {
                        b = 'a';
                    }
                    for (int m = 1; m <= l; m++) {
                        String secondLetter = "" + c;
                        c++;
                        if (m == l) {
                            c = 'a';
                        }
                        for (int o = 1; o <= n; o++) {
                            String result = "" + i + j + firstLetter + secondLetter + o;
                            System.out.print(result + " ");
                        }
                    }
                }
            }
        }
    }
}

