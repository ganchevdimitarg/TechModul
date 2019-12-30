import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Legendary_Farming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isObraned = false;

        Map<String, Integer> keyRegant = new HashMap<>();
        Map<String, Integer> jung = new TreeMap<>();

        keyRegant.put("motes", 0);
        keyRegant.put("shards", 0);
        keyRegant.put("fragments", 0);
        while (!isObraned) {
            String[] matirials = scanner.nextLine().split("\\s+");

            for (int i = 0; i < matirials.length; i += 2) {
                int quantity = Integer.parseInt(matirials[i]);
                String regant = matirials[i + 1].toLowerCase();

                if (regant.equals("motes") || regant.equals("shards") || regant.equals("fragments")) {
                    keyRegant.put(regant, keyRegant.get(regant) + quantity);

                    if (keyRegant.get(regant) >= 250) {
                        keyRegant.put(regant, keyRegant.get(regant) - 250);
                        if (regant.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        } else if (regant.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else {
                            System.out.println("Valanyr obtained!");
                        }
                        isObraned = true;
                        break;
                    }
                } else {
                    if (!jung.containsKey(regant)) {
                        jung.put(regant, quantity);
                    } else {
                        jung.put(regant, jung.get(regant) + quantity);
                    }
                }
            }
        }
        keyRegant.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue())));

        jung.forEach((k, v) -> System.out.println(String.format("%s: %d", k, v)));
    }
}
