import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSnowBall = Integer.parseInt(scanner.nextLine());

        double highest = 0;
        int finalSnowballSnow = 0;
        int finalSnowballTime = 0;
        int finalSnowballQuality = 0;

        for (int i = 0; i < numSnowBall; i++) {
            int  snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if (snowballValue > highest) {
                highest = snowballValue;
                finalSnowballSnow = snowballSnow;
                finalSnowballTime = snowballTime;
                finalSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", finalSnowballSnow, finalSnowballTime, highest, finalSnowballQuality);
    }
}

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSnowBall = Integer.parseInt(scanner.nextLine());
        int snowballValue = 0;
        int highest = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        int finalSnowballSnow = 0;
        int finalSnowballTime = 0;
        int finalSnowballQuality = 0;
        for (int i = 0; i < numSnowBall; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue >= highest) {
                highest = snowballValue;
                finalSnowballSnow = snowballSnow;
                finalSnowballTime = snowballTime;
                finalSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", finalSnowballSnow, finalSnowballTime, highest, finalSnowballQuality);
    }
}
