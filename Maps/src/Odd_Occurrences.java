import java.util.*;

public class Odd_Occurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String num : words) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        List<String> outStr = new ArrayList<>();
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() % 2 != 0) {
                outStr.add(e.getKey());
            }
        }
        for (int i = 0; i < outStr.size(); i++) {
            System.out.print(outStr.get(i));
            if (i < outStr.size() - 1){
                System.out.print(", ");
            }
        }
    }
}

