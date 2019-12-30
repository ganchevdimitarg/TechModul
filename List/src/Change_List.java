import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("end")) {
            String[] tokens = cmd.split("\\s+");

            if (tokens[0].equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                while (numbers.contains(element)) {
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int index = Integer.parseInt(tokens[2]);
                int element = Integer.parseInt(tokens[1]);
                if (index < numbers.size()) {
                    numbers.add(index, element);
                }

            }

            cmd = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}

