import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());

        if (numbers.size() < 3) {
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
