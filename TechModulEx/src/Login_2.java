import java.util.Scanner;

public class Login_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String reverse = new StringBuffer(name).reverse().toString();
        String pass = "";
        String attempt = scanner.nextLine();
        int tryfour = 1;
        for (int i = name.length() - 1; i >= 0; i--) {
            pass += name.charAt(i);
        }

        while (!attempt.equals(pass)){
            tryfour++;
            System.out.println("Incorrect password. Try again.");
            attempt = scanner.nextLine();
            if (tryfour == 4){
                break;
            }
        }
        if (attempt.equals(pass)){
            System.out.printf("User " + name + " logged in.");
        }else {
            System.out.println("User " + name + " blocked!");
        }
    }
}
