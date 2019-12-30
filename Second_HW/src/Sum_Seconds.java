import java.util.Scanner;

public class Sum_Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int secund = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int total = first + secund + third;

        if (total > 0 && total <= 59) {
            int asd = total;
            if (asd < 10) {
                System.out.println("0:0" + asd);
            } else {
                System.out.println("0:" + asd);
            }
        } else if (total >= 60 && total <= 119) {
            int asd = total - 60;
            if (asd < 10) {
                System.out.println("1:0" + asd);
            } else {
                System.out.println("1:" + asd);
            }
        } else if (total >= 120 && total <= 179) {
            int asd = total - 120;
            if (asd < 10) {
                System.out.println("2:0" + asd);
            } else {
                System.out.println("2:" + asd);
            }
        }
    }
}
