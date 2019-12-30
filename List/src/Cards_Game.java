import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int battleIndex = 0;
        boolean firstDeckEmpty = false;
        boolean secondDeckEmpty = false;

        while (true) {
            if (firstDeck.get((battleIndex)) > secondDeck.get((battleIndex))) {
                firstDeck.add(firstDeck.get(battleIndex));
                firstDeck.add(secondDeck.get(battleIndex));
                firstDeck.remove(battleIndex);
                secondDeck.remove(battleIndex);

            } else if (firstDeck.get((battleIndex)) < secondDeck.get((battleIndex))) {
                secondDeck.add(secondDeck.get(battleIndex));
                secondDeck.add(firstDeck.get(battleIndex));
                firstDeck.remove(battleIndex);
                secondDeck.remove(battleIndex);

            } else if (firstDeck.get((battleIndex)).equals(secondDeck.get((battleIndex)))) {
                firstDeck.remove(battleIndex);
                secondDeck.remove(battleIndex);
            }

            if (firstDeck.size() == 0) {
                firstDeckEmpty = true;
                break;
            }

            if (secondDeck.size() == 0) {
                secondDeckEmpty = true;
                break;
            }
        }

        if (secondDeck.isEmpty()) {
            int sum = 0;
            for (Integer integer : firstDeck) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);

        } else if (firstDeck.isEmpty()) {
            int sum = 0;
            for (Integer integer : secondDeck) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}

