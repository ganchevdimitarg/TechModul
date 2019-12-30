import java.util.Scanner;

public class L_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(width,length));
    }

    public static int calculateArea (int w, int l){
        int area = w * l;

        return area;
    }
}
