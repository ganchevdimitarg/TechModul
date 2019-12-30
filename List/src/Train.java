import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String str = scanner.nextLine();

        while (!str.equals("end")) {
            String[] token = str.split(" ");
            if (token[0].equals("Add")) {
                int newWagon = Integer.parseInt(token[1]);
                wagons.add(newWagon);
            } else {
                int passengars = Integer.parseInt(token[0]);
                wagons.stream().filter(w -> maxCapacity - w >= passengars)
                        .findFirst()
                        .ifPresent(freeWagon ->{
                            int indexOfFreeWagons = wagons.indexOf(freeWagon);
                            wagons.set(indexOfFreeWagons, freeWagon + passengars);
                        });

            }

            str = scanner.nextLine();
        }
        wagons.forEach(w -> System.out.print(w + " "));
    }
}
