import java.util.Scanner;

public class Equal_Words {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String wordOne = scanner.nextLine().toLowerCase();
        String wordTwo = scanner.nextLine().toLowerCase();

        if (wordOne.equals(wordTwo)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
