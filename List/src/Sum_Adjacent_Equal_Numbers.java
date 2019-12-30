import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numbers.size() - 1; i++) {
            if (i > 0) {
                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                    numbers.remove(numbers.get(i + 1));
                    i -= 1;
                }
            }
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(numbers.get(i + 1));
                i -= 1;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        for (Double number : numbers) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
