import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Opinion_Poll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> people = new TreeMap<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] token = scanner.nextLine().split(" ");

            people.putIfAbsent(token[0], 0);

            people.put(token[0], Integer.parseInt(token[1]));
        }

        for (Map.Entry<String, Integer> e : people.entrySet()){
            if (e.getValue() > 30) {
                System.out.printf("%s - %s%n", e.getKey(), e.getValue());
            }
        }
    }
}
