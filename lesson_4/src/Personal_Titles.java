import java.util.Scanner;

public class Personal_Titles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        char appeal = scanner.nextLine().charAt(0);

        if (age < 16 && appeal == 'm'){
            System.out.println("Master");
        } else if (age >= 16 && appeal == 'm'){
            System.out.println("Mr.");
        } else if (age < 16 && appeal == 'f'){
            System.out.println("Miss");
        } else if (age >= 16 && appeal == 'f') {
            System.out.println("Ms.");
        }
    }
}
