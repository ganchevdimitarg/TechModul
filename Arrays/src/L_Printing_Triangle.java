import java.util.Scanner;

public class L_Printing_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);
    }

    public static void printTriangle (int num){
        for (int i = 0; i < num + 2; i++) {
            System.out.println(1 + " ");
            for (int j = 0; j < num; j++) {
                System.out.println(1 + j);
            }
        }
    }

}
