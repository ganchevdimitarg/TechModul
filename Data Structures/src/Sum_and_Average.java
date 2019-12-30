import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum_and_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        double average;
        for (Integer integer : sequence) {
            sum += integer;
        }
        average = (double) sum / sequence.size();

        if (sequence.isEmpty()){
            System.out.printf("Sum=%d; Average=%f", 0, 0.00);
        } else {
            System.out.printf("Sum=%d; Average=%.2f", sum, average);
        }
    }
}
