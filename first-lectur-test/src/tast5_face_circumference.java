import java.util.Scanner;

public class tast5_face_circumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle r: ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Area= " + (Math.PI * r * r));
        System.out.println("Perimetar= " + (2 * Math.PI * r));
    }
}
