import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Merging_Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int lengthMax = Math.max(firstNumbers.size(), secondNumbers.size());
        int lengthMin = Math.min(firstNumbers.size(), secondNumbers.size());

        for (int i = 0; i <= lengthMin - 1; i++) {
            System.out.print(firstNumbers.get(i) + " " + secondNumbers.get(i) + " ");
        }
        for (int i = lengthMin; i <= lengthMax - 1; i++) {
            if (firstNumbers.size() > secondNumbers.size()){
                System.out.print(firstNumbers.get(i) + " ");
            } else {
                System.out.print(secondNumbers.get(i) + " ");
            }
        }
    }
}
