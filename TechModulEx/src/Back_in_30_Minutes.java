import java.util.Scanner;

public class Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minuts = Integer.parseInt(scanner.nextLine());

        int backMinutes = minuts + 30;

        if (backMinutes > 59){
            hours += 1;
            backMinutes -= 60;
        }

        if (hours >= 24){
            hours -= 24;
        }
        if (backMinutes < 10){
            System.out.printf("%d:0%d", hours,backMinutes);
        } else {
            System.out.printf("%d:%d", hours,backMinutes);
        }
    }
}
