import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Remove_Negatives_and_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e -> e <0);
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) < 0){
//                numbers.remove(i);
//                i -= 1;
//            }
//        }
        if (numbers.isEmpty()){
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            numbers.forEach(e -> System.out.print(e + " "));
        }
    }
}
