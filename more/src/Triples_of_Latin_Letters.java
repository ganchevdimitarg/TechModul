import java.util.Scanner;

public class Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char letterOne = (char)('a'+i);
                    char letterTwo = (char)('a'+j);
                    char letterThree = (char)('a'+k);
                    System.out.printf("%s%s%s%n", letterOne, letterTwo, letterThree);
                }
            }
        }
    }
}
