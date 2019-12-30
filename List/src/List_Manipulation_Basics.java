import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Manipulation_Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("end")) {
            String[] token = cmd.split("\\s+");

            switch (token[0]) {
                case "Add":
                    numbers.add(Integer.valueOf(token[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(token[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(token[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(token[2]), Integer.parseInt(token[1]));
                    break;
                default:
                    break;
            }
            cmd = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
