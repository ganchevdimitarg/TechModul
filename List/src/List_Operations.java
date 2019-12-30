import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("End")) {
            String[] tokans = cmd.split("\\s+");
            switch (tokans[0]) {
                case "Add":
                    numbers.add(Integer.valueOf(tokans[1]));
                    break;
                case "Insert":
                    if (Integer.valueOf(tokans[2]) < 0 || Integer.valueOf(tokans[2]) > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(Integer.valueOf(tokans[2]), Integer.valueOf(tokans[1]));

                    }
                    break;
                case "Remove":
                    if (Integer.valueOf(tokans[1]) < 0 || Integer.valueOf(tokans[1]) > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        int index = Integer.parseInt(tokans[1]);
                        numbers.remove(index);

                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokans[2]);
                    count = count % numbers.size();
                    if (tokans[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }

            cmd = scanner.nextLine();
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
