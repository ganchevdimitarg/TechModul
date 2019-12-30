import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Winning_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tickets = Arrays.stream(scanner.nextLine().split("[]\\s,\\s]+")).collect(Collectors.toList());

        for (String ticket : tickets) {
            String[] newTicket = ticket.split("[^\\$@#\\^]+");
            if (ticket.matches("[^\\$@#\\^]+") && ticket.length() == 20) {
                System.out.printf("ticket \"%s\" - no match%n", ticket);
            } else if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else if (newTicket.length > 1) {
                if (newTicket[1].length() >= 6 && newTicket[2].length() <= 9) {
                    System.out.printf("ticket \"%s\" - %d%c%n", ticket, newTicket[1].length(), newTicket[1].charAt(0));
                }
            } else {
                System.out.printf("ticket \"%s\" - 10%c Jackpot!%n", ticket, ticket.charAt(0));
            }
        }
    }
}

