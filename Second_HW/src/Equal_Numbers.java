import java.util.Scanner;

public class Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        if (numOne == numTwo && numOne == numThree){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
