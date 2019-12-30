import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length= Integer.parseInt(scanner.nextLine());
        int width= Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume= length*width*height;
        double commonly= volume*0.001;
        double percetnCommonly = percent*0.01;
        double litre = commonly*(1-percetnCommonly);

        System.out.printf("%.3f",litre);
    }
}
