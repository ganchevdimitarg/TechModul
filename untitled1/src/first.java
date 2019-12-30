import java.util.Scanner;

public class Party_Profit_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coin = 0;

        for (int i = 0; i < days; i++) {
            coin += (50 - (2 * partySize));
            if (days % 3 == 0) {
                coin -= (3 * partySize);
            }
            if (days % 5 == 0) {
                coin += 20 - (2 * partySize);
            }
            if (days % 10 == 0) {
                partySize -= 2;
            }
            if (days % 15 == 0) {
                partySize += 5;
            }
        }

        int finalCoinPerCompanions = coin / partySize;

        System.out.printf("%d companions received %d coins each.", partySize, finalCoinPerCompanions);
    }
}
