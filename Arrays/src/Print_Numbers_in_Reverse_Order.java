import java.util.Scanner;

public class Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int[] numArray = new int[numbers];

        for (int i = 0; i < numArray.length; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numArray[i] = num;
        }

        int[] numArrayFinal = new int[numbers];
        for (int i = 0; i < numArrayFinal.length; i++) {
            numArrayFinal[numArrayFinal.length - i -1] = numArray[i];
        }
        for (int i = 0; i < numArrayFinal.length; i++) {
            System.out.print(numArrayFinal[i] + " ");
        }
    }
}
