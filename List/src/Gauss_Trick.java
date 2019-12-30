import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Gauss_Trick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        if (numbers.size() == 1) {
            System.out.println(numbers.get(0));
        } else {
            int sum = numbers.get(0) + numbers.get(numbers.size() - 1);
            numbers.set(0, sum);
            numbers.remove(numbers.size() - 1);
            for (int i = 1; i < numbers.size() - 1; i++) {
                sum = 0;
                sum += numbers.get(i) + numbers.get((numbers.size() - 1));
                numbers.set(i, sum);
                numbers.remove(numbers.size() - 1);
            }
            numbers.forEach(e -> System.out.print(e + " "));
        }
    }
}
