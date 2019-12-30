import java.util.Scanner;

public class Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] row = scanner.nextLine().split(" ");

        int[] numbers = new int[row.length];

        int couter = 1;
        int max = 1;
        int bestIndex = 0;
        for (int i = 0; i < row.length; i++) {
            numbers[i] = Integer.parseInt(row[i]);
        }
        for (int i = 0; i < row.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                couter++;

            } else {
                couter = 1;
            }

            if (couter > max) {
                max = couter;
                bestIndex = i + 1;
            }
        }

        int begin = (bestIndex - max) + 1;
        for (int i = begin; i < begin + max ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
