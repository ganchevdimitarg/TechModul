import java.util.Scanner;

public class UnitOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coin = 0;

        for (int i = 1; i <= days; i++) {
            coin += 50 - (2 * partySize);
            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;
            }
            if (i % 3 == 0) {
                coin -= (3 * partySize);
            }
            if (i % 5 == 0) {
                coin += (20 * partySize);
                if (i % 3 == 0) {
                    coin -= (2 * partySize);
                }
            }
        }

        int finalCoinPerCompanions = coin / partySize;

        System.out.printf("%d companions received %d coins each.", partySize, finalCoinPerCompanions);
    }
}