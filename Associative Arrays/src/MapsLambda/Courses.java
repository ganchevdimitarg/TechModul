package MapsLambda;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\s+:\\s+");

        while (!input[0].equals("end")) {

            if (!courses.containsKey(input[0])) {
                courses.put(input[0], new ArrayList<>());
                courses.get(input[0]).add(input[1]);
            } else {
                courses.get(input[0]).add(input[1]);
            }
            input = scanner.nextLine().split("\\s+:\\s+");
        }

        courses.entrySet().stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    Collections.sort(entry.getValue());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.printf(" -- %s%n", entry.getValue().get(i));
                    }
                });
    }
}