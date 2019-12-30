import java.util.Scanner;

public class Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStr = scanner.nextLine().split(" ");
        int[] n = new int[inputStr.length];

        for (int i = 0; i < inputStr.length; i++) {
            n[i] = Integer.parseInt(inputStr[i]);
        }

        int output = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                int sum = n[i] + n[j];
                if (sum == output) {
                    System.out.println(n[i] + " " + n[j]);
                }
            }
        }
    }
}
