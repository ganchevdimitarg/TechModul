import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> repetedNum = new TreeMap<>();
        for (double num : nums) {
            repetedNum.putIfAbsent(num, 0);

            repetedNum.put(num, repetedNum.get(num) + 1);
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> e : repetedNum.entrySet()) {
            System.out.printf("%s -> %d%n", decimalFormat.format(e.getKey()), e.getValue());
        }


    }
}
