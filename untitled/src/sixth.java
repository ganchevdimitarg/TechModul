import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int juiceMax = Integer.parseInt(scanner.nextLine());

        int maxRasp = 0;
        int maxStraw = 0;
        int maxCherries = 0;
        double juiceTotal = 0.0;

        for (int i = 0; i <= c; i++) {
            for (int j = 0; j <= s; j++) {
                for (int k = 0; k <= r; k++) {
                    double cherries = 15 * i;
                    double strawberries = 7.5 * j;
                    double raspberries = 4.5 * k;
                    double juiceCurrent = cherries + strawberries + raspberries;
                    if (juiceCurrent <= juiceMax) {
                        if (juiceCurrent > juiceTotal) {
                            juiceTotal = juiceCurrent;
                        }
                        if (juiceCurrent >= juiceTotal) {
                            maxCherries = i;
                            maxStraw = j;
                            maxRasp = k;
                        }
                    }
                }
            }
        }
        System.out.printf("%d Raspberries, %d Strawberries, %d Cherries. Juice: %s ml.", maxRasp, maxStraw, maxCherries, juiceTotal);

    }
}
