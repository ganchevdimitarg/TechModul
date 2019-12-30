import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("[: ][ | ]+");
        String[] cmd = scanner.nextLine().split("[ | ]+");
        String lastCmd = scanner.nextLine().toLowerCase();

        Map<String, List<String>> dectionary = new TreeMap<>();

        for (int i = 0; i < words.length - 1; i++) {

            if (i % 2 == 0) {
                dectionary.putIfAbsent(words[i], new ArrayList<>());
                dectionary.get(words[i]).add(words[i + 1]);
            }
        }

        if (lastCmd.equals("list")) {
            for (Map.Entry<String, List<String>> stringListEntry : dectionary.entrySet()) {
                System.out.print(stringListEntry.getKey() + " ");
            }
        } else {
            for (Map.Entry<String, List<String>> stringListEntry : dectionary.entrySet()) {
                System.out.println(stringListEntry.getKey());
                stringListEntry.getValue().sort((o1, o2) -> Integer.compare(o2.length(), o1.length()));
                for (int i = 0; i < stringListEntry.getValue().size(); i++) {
                    System.out.printf(" -%s%n", stringListEntry.getValue().get(i));
                }
            }
        }
    }
}

