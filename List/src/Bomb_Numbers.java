import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bomb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bombNumer = bomb[0];
        int bombPower = bomb[1];


        while (numbers.contains(bombNumer)) {

            int index = numbers.indexOf(bombNumer);
            int begin =  index - bombPower;
            begin = Math.max(0, begin);

            for (int i = begin; i < index; i++) {
                numbers.remove(begin);
            }

            index = numbers.indexOf(bombNumer);
            int end = Math.min(index + bombPower, numbers.size()-1);
            for (int i = index; i <= end; i++) {
                numbers.remove(index);
            }
        }
        int sum = 0;
        for (Integer number : numbers){
            sum += number;
        }
        System.out.println(sum);
    }
}
