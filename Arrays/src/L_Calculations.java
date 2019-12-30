import java.util.Scanner;

public class L_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String methods = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        calculationNumber(methods, numberOne, numberTwo);
    }

    public static void calculationNumber(String str, int numOne, int numTwo) {
        if (str.equals("add")) {
            System.out.println(numOne + numTwo);
        } else if (str.equals("subtract")) {
            System.out.println(numOne - numTwo);
        } else if (str.equals("multiply")) {
            System.out.println(numOne * numTwo);
        } else {
            System.out.println(numOne / numTwo);
        }

    }
}
