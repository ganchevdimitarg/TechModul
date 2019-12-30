import java.util.Scanner;

public class secand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());

        int sum = m + t;
        int hoursToAdd = sum / 60;
        int minutesToAdd = sum % 60;

        int totalHours = h + hoursToAdd;

        if(totalHours == 24){
            totalHours = 0;
        }
        if(totalHours > 24){
            totalHours = totalHours - 24;
        }
        System.out.printf("%dh %dm", totalHours, minutesToAdd);


    }
}
