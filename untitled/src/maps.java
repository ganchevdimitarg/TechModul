import java.util.*;

public class maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> inputStr = new HashMap<>();
        inputStr.put("a", "imalo edno vreme");
        inputStr.put("c", "edno malko momichence");
        inputStr.put("d", "to si igraelo s kukli i grachko");
        inputStr.put("b", "mnogo bichalo da kara kolelo");
        inputStr.put("e", "angelche na maika si");
        inputStr.put("g", "detence milo");
        inputStr.put("f", "hubavo");
        inputStr.put("y", "nervo i bezposhtadno");
        inputStr.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(e -> System.out.println(e.getKey()));
        inputStr.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(e -> System.out.println(e.getKey()));
        inputStr.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).forEach(e -> System.out.println(e.getValue()));
        inputStr.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(e -> System.out.println(e.getValue()));
        inputStr.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().length(), e1.getValue().length())).forEach(e -> System.out.println(e.getValue()));
        inputStr.entrySet().stream().sorted((e1, e2) -> Integer.compare(e1.getValue().length(), e2.getValue().length())).forEach(e -> System.out.println(e.getValue()));
        System.out.println();

        Map<String, Integer> inputInt = new HashMap<>();
        inputInt.put("a", 5);
        inputInt.put("c", 2);
        inputInt.put("d", 1);
        inputInt.put("b", 8);
        inputInt.entrySet().stream().sorted((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())).forEach(e -> System.out.println(e.getValue()));
        inputInt.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).forEach(e -> System.out.println(e.getValue()));
        System.out.println();

        Map<String, Double> inputDouble = new HashMap<>();
        inputDouble.put("a", 3.12);
        inputDouble.put("c", 7.51);
        inputDouble.put("d", 3.67);
        inputDouble.put("b", 8.02);
        inputDouble.put("j", 8.01);
        inputDouble.entrySet().stream().sorted((e1, e2) -> Double.compare(e1.getValue(), e2.getValue())).forEach(e -> System.out.println(e.getValue()));
        inputDouble.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue())).forEach(e -> System.out.println(e.getValue()));
        System.out.println();

        Map<String, List<String>> secondStr = new HashMap<>();
        secondStr.put("one", new ArrayList<>());
        secondStr.get("one").add("imalo edno vreme");
        secondStr.get("one").add("edno malko momichence");
        secondStr.get("one").add("to si igraelo s kukli i grachko");
        secondStr.put("two", new ArrayList<>());
        secondStr.get("two").add("mnogo bichalo da kara kolelo");
        secondStr.get("two").add("angelche na maika si");
        secondStr.get("two").add("detence milo");
        for (Map.Entry<String, List<String>> stringListEntry : secondStr.entrySet()) {
            stringListEntry.getValue().stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Integer.compare(e1.length(), e2.length())).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Integer.compare(e2.length(), e1.length())).forEach(e -> System.out.println(e));
        }
        System.out.println();

        Map<String, List<Integer>> secondInt = new HashMap<>();
        secondInt.put("three", new ArrayList<>());
        secondInt.get("three").add(4);
        secondInt.get("three").add(7);
        secondInt.get("three").add(12);
        secondInt.get("three").add(87);
        for (Map.Entry<String, List<Integer>> stringListEntry : secondInt.entrySet()) {
            stringListEntry.getValue().stream().sorted(Integer::compareTo).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Integer.compare(e1, e2)).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Integer.compare(e2, e1)).forEach(e -> System.out.println(e));
        }
        System.out.println();

        Map<String, List<Double>> secondDouble = new HashMap<>();
        secondDouble.put("three", new ArrayList<>());
        secondDouble.get("three").add(54.32);
        secondDouble.get("three").add(2.31);
        secondDouble.get("three").add(2.13);
        secondDouble.get("three").add(43.3);
        for (Map.Entry<String, List<Double>> stringListEntry : secondDouble.entrySet()) {
            stringListEntry.getValue().stream().sorted(Double::compareTo).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Double.compare(e1, e2)).forEach(e -> System.out.println(e));
            stringListEntry.getValue().stream().sorted((e1, e2) -> Double.compare(e2, e1)).forEach(e -> System.out.println(e));
        }


    }
}
