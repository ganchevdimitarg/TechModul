import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Randomize_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        for (int pos1 = 0; pos1 < words.size() - 1; pos1++) {

            int pos2 = rnd.nextInt(words.size());

            words.add(pos2, words.get(pos1));
        }

        words.forEach(System.out::println);
    }
}
