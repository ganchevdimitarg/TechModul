import java.util.Scanner;

public class Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secNum = Integer.parseInt(scanner.nextLine());
        int tridNum = Integer.parseInt(scanner.nextLine());

        int add = addFirstAndSecondDigits(firstNum,secNum);
        System.out.println(substractAddAndTridDigit(add, tridNum));
    }

    public static int addFirstAndSecondDigits(int f, int s) {
        return f + s;
    }

    public static int substractAddAndTridDigit (int a, int t){
        return a - t;
    }
}
