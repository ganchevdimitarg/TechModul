import java.util.*;
import java.util.stream.Collectors;

public class Count_Chars_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // създаване на мапове
        Map<Character, Integer> charByOccurances = new LinkedHashMap<>();

        // вземам всечи char от string
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter != ' ') {
                //ако за пръв път срещаш буква, я добави
                if (!charByOccurances.containsKey(letter)) {
                    charByOccurances.put(letter, 1);
                } else {
                    //увеличаване на стойността, ако се съдържа
                    charByOccurances.put(letter, charByOccurances.get(letter) + 1);
                }
            }
        }

        //ще принтира всещи чар от тази мап според ключа
        for (Character chari : charByOccurances.keySet()){
            System.out.println(String.format("%c -> %d", chari, charByOccurances.get(chari)));
        }
    }
}
