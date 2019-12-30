import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Manipulation_Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("end")) {
            String[] token = cmd.split("\\s+");

            if (token[0].equals("Contains")) {
                if (numbers.contains(Integer.parseInt(token[1]))) {
                    System.out.print("Yes");
                } else {
                    System.out.print("No such number");
                }
            } else if (token[0].equals("Print")) {
                if (token[1].equals("even")) {
                    numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));
                } else {
                    numbers.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
                }
            } else if (token[0].equals("Get")) {
                numbers.stream().reduce((r, e) -> e + r).ifPresent(e -> System.out.print(e + " "));
            } else if (token[0].equals("Filter")) {
                if (token[1].equals("<")){
                    numbers.stream().filter(e -> e < Integer.parseInt(token[2])).forEach(e -> System.out.print(e + " "));
                } else if (token[1].equals(">")){
                    numbers.stream().filter(e -> e > Integer.parseInt(token[2])).forEach(e -> System.out.print(e + " "));
                } else if (token[1].equals("<=")){
                    numbers.stream().filter(e -> e <= Integer.parseInt(token[2])).forEach(e -> System.out.print(e + " "));
                } else if (token[1].equals(">=")){
                    numbers.stream().filter(e -> e >= Integer.parseInt(token[2])).forEach(e -> System.out.print(e + " "));
                }
            }
            System.out.println();
            cmd = scanner.nextLine();
        }
    }
}
