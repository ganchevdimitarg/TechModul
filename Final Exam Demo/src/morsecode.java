import java.util.*;
import java.util.stream.Collectors;

public class morsecode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> morsecode = Arrays.stream(scanner.nextLine().split("[\\s](?=\\|)[|](?<=\\|)[\\s]")).collect(Collectors.toList());

        Map<String, String> printStr = new LinkedHashMap<>();
        printStr.put(".-", "A");
        printStr.put("-...", "B");
        printStr.put("-.-.", "C");
        printStr.put("-..", "D");
        printStr.put(".", "E");
        printStr.put("..-.", "F");
        printStr.put("--.", "G");
        printStr.put("....", "H");
        printStr.put("..", "I");
        printStr.put(".---", "J");
        printStr.put("-.-", "K");
        printStr.put(".-..", "L");
        printStr.put("--", "M");
        printStr.put("-.", "N");
        printStr.put("---", "O");
        printStr.put(".--.", "P");
        printStr.put("--.-", "Q");
        printStr.put(".-.", "R");
        printStr.put("...", "S");
        printStr.put("-", "T");
        printStr.put("..-", "U");
        printStr.put("...-", "V");
        printStr.put(".--", "W");
        printStr.put("-..-", "X");
        printStr.put("-.--", "Y");
        printStr.put("--..", "Z");

        for (String s : morsecode) {
            if (s.contains(" ")) {
                String[] n = s.split(" ");
                for (String s1 : n) {
                    for (Map.Entry<String, String> entry : printStr.entrySet()) {
                        if (entry.getKey().equals(s1)) {
                            System.out.print(entry.getValue());
                            break;
                        }
                    }
                }
                System.out.print(" ");
            } else {
                for (Map.Entry<String, String> entry : printStr.entrySet()) {
                    if (entry.getKey().equals(s)) {
                        System.out.print(entry.getValue() + " ");
                        break;
                    }
                }
            }
        }
    }
}
