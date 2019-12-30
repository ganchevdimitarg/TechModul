import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArray = scanner.nextLine();
        String secondArray = scanner.nextLine();

        String[] one = firstArray.split(" ", -1);
        String[] two = secondArray.split(" ", -1);
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < one.length; j++) {
                if (two[i].equals(one[j])) {
                    System.out.print(one[j] + " ");
                }
            }
        }
    }
}
