import java.util.Scanner;

public class Time_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int time;
        int timeTwo;

        if (0 <= hour || hour <= 23 && 0 <= minute || minute <= 59) {
            timeTwo = minute + 15;

            if (timeTwo > 59) {
                time = hour + 1;
                timeTwo = timeTwo - 60;

                if (time > 23) {
                    if (timeTwo < 10) {
                        System.out.println((time - 24) + ":0" + timeTwo);
                    } else {
                        System.out.println((time - 24) + ":" + timeTwo);
                    }
                } else {
                    if (timeTwo < 10) {
                        System.out.println(time + ":0" + timeTwo);
                    } else {
                        System.out.println(time + ":" + timeTwo);
                    }
                }
            } else {
                if (timeTwo < 10) {
                    System.out.println(hour + ":0" + timeTwo);
                } else {
                    System.out.println(hour + ":" + timeTwo);
                }
            }
        }
    }
}
